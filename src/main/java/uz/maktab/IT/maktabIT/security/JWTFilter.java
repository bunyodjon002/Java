package uz.maktab.IT.maktabIT.security;


import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JWTFilter extends OncePerRequestFilter {


    @Autowired
    private JwtTokenUtil jwtTokenUtil;



    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {


        try{
            String jwtToken = extraJwtFromRequest(request);
           if(StringUtils.hasText(jwtToken) && jwtTokenUtil.validationToken(jwtToken)){
               UserDetails userDetails = new User(jwtTokenUtil.getUsernameFromToken(jwtToken) ," ",
                       jwtTokenUtil.getRoleFromToken(jwtToken));


                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        userDetails , null , userDetails.getAuthorities());

                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);

            }


        } catch (ExpiredJwtException ex){
            request.setAttribute("exception" , ex);
            throw ex;
        }
        catch (BadCredentialsException ex){
            request.setAttribute("exception" , ex);
            throw ex;
        }
 filterChain.doFilter(request , response);

    }




    private String extraJwtFromRequest(HttpServletRequest request) {
        String bearerToken = request.geth("Authorization");
        if(StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer")){
            return bearerToken.substring(7,bearerToken.length());
    }
        return null;

    }
}









































///agarda siz ushbu so'zlarni o'qayotgan bo'lsangiz demak sizda detektivlik qobilyiati bor ekan iltimos pasga tushib o'qimang



































































































































































///iltimos tushmang






















































//iltimos










































//hech narsa yoq edi siz qiziqonsiz