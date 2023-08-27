package uz.maktab.IT.maktabIT.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import uz.maktab.IT.maktabIT.entity.User;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class UserMaxsus implements UserDetails {

    private String login;
    private String password;
    private Set<SimpleGrantedAuthority> lavozimlar;
    private Boolean aktiv;

    public UserMaxsus(){}
public UserMaxsus(User user){
        this.login=user.getlogin();
        this.password=user.getPassword();
        this.lavozimlar=
                user.getPositions()
                        .stream()
                        .map(l->new SimpleGrantedAuthority(l.name()))
                        .collect(Collectors.toSet());
        this.aktiv=user.getActive();



}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
