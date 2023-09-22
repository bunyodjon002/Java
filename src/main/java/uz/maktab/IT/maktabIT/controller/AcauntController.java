package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.User;
import uz.maktab.IT.maktabIT.repository.UserRepository;
import uz.maktab.IT.maktabIT.security.JwtTokenUtil;
import uz.maktab.IT.maktabIT.security.Token;
import uz.maktab.IT.maktabIT.security.UserMaxsus;
import uz.maktab.IT.maktabIT.security.UserProvider;
import uz.maktab.IT.maktabIT.service.dto.UserDTO;
import uz.maktab.IT.maktabIT.service.vm.UserPasswordWM;
import uz.maktab.IT.maktabIT.service.vm.UserService;

@RestController
@RequestMapping("/api/account")
public class AcauntController {
    @Autowired
    UserProvider userProvider;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @Autowired
    PasswordEncoder passwordEncoder;
    @PostMapping("/authenticate")
    public ResponseEntity<Token> login(@RequestBody UserMaxsus userMaxsus) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userMaxsus.getUsername(), userMaxsus.getPassword()
            ));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);

        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        UserDetails userDetails = userProvider.loadUserByUsername(userMaxsus.getUsername());
        String token = jwtTokenUtil.generateToken(userDetails ,true);
        return ResponseEntity.ok(new Token(token));
    }
    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody User userDTO){
        if(userDTO.getId() !=null)
            return  ResponseEntity.badRequest().build();
        return ResponseEntity.ok(userService.create(userDTO));
    }
    @GetMapping()
    public ResponseEntity<UserDTO> getCurrentUser(){
        return  ResponseEntity.ok(userService.getCurrenUser());
    }


    @PutMapping
    public UserDTO update (@RequestBody UserDTO userDTO) {
        User current  = userService.getCurrenUserEntity();
        current.setName(userDTO.getName());
        current.setSurname(userDTO.getSurname());

        return userService.update(current);
    }

    @PutMapping("/password")
    public ResponseEntity<?> updatePassword(@RequestBody UserPasswordWM parol){
        User current= userService.getCurrenUserEntity();
        if(current.getPassword().equals(passwordEncoder.encode(parol.getOldPassword()))) {
            current.setPassword(passwordEncoder.encode(parol.getNewPassword()));
            return ResponseEntity.ok(userService.update(current));

        }
        return ResponseEntity.badRequest().build();
}}
