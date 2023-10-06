package uz.maktab.IT.maktabIT.security;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenUtil implements Serializable {
    private String secret;
    private int jwtExpirationMs;
    private int jwtExpirationInRememberMe;

@Value("${jwt.secret}")
    public void  JwtTokenUtil(String secret) {
        this.secret = secret;
    }

    @Value("${jwt.jwtExpirationMs}")
   public void setJwtExpirationMs(String jwtExpirationMs){
       this.jwtExpirationInRememberMe= Integer.parseInt(jwtExpirationMs);
   }

    @Value("${jwt.jwtExpirationInRememberMe}")
    public void setjwtExpirationInRememberMe(String jwtExpirationInRememberMe){
        this.jwtExpirationInRememberMe= Integer.parseInt(jwtExpirationInRememberMe);
    }
//token generatsiya qilish



public String generateToken(UserDetails userDetails, boolean rememberMe) {
        Map<String, Object> claims = new HashMap<>();

        Collection<? extends GrantedAuthority> roles = userDetails.getAuthorities();


       claims.put("roles", roles.stream().map(e -> {
            return e.getAuthority().toString();
      }).toArray());


        return doGenerateToken(claims, userDetails.getUsername(), rememberMe);
   }

    private String doGenerateToken(Map<String, Object> claims, String subject, boolean rememberMe) {

       return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
              .setExpiration(new Date(System.currentTimeMillis() + (rememberMe ? jwtExpirationInRememberMe : jwtExpirationMs))).signWith(SignatureAlgorithm.HS512, secret).compact();
   }



   public boolean validationToken(String autToken) {
        try{
           Jws<Claims> claimsJ = Jwts.parser().setSigningKey(secret).parseClaimsJws(autToken);
            return true;
       } catch (SignatureException | MalformedJwtException | UnsupportedJwtException | IllegalArgumentException ex){
            System.out.println("Incorruptible");
            throw new BadCredentialsException("INVALID_CREDENTIALS" , ex);
        }

        catch ( ExpiredJwtException ex){
            System.out.println("The term is outdated");
          return false;
       }
}

public String  getUsernameFromToken(String token){
    Claims  claims  = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    return claims.getSubject();
}

  public List<SimpleGrantedAuthority> getRoleFromToken(String authToken){
    List<SimpleGrantedAuthority> roles = null;
    Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(authToken).getBody();

    roles = ((List<String>) claims.get("roles" , List.class))
            .stream().map(SimpleGrantedAuthority::new)
            .collect(Collectors.toList());
    return  roles;
  }



}