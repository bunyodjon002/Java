package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Position;
import uz.maktab.IT.maktabIT.entity.User;
import uz.maktab.IT.maktabIT.repository.UserRepository;
import uz.maktab.IT.maktabIT.service.dto.UserDTO;
import uz.maktab.IT.maktabIT.service.vm.UserService;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class Userserviceimpl implements UserService {
    @Autowired
    UserRepository userRepository;


private PasswordEncoder encoder;

 @Bean
    PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    public Optional<User> getByIdEntity(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserDTO> getAll() {

     return userRepository.findAllByPositionsContains(Position.Manager)
             .stream()
             .map(UserDTO::new)
             .collect(Collectors.toList());


    }

    @Override
    public UserDTO update(User user) {

     return new UserDTO(userRepository.save(user));
    }

    @Override
    public Optional<UserDTO> getById(Long id) {
        return userRepository.findById(id).map(UserDTO::new);
    }

    @Override
    public UserDTO create(User user) {

      user.setPassword(encoder.encode(user.getPassword()));
      user.setPositions(Set.of(Position.Manager));
      return new UserDTO(userRepository.save(user));
    }

    @Override
    public User getCurrenUserEntity() {


             String username = getPricipal();
     if (username != null)
         return userRepository.findByLogin(username).orElse(null);



   return null;

    }



    @Override
    public void deleteById(Long id) {
  userRepository.deleteById(id);
    }

    private String getPricipal() {

        String userName = null;
        Object priObject = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (priObject instanceof UserDetails){
            userName = ((UserDetails) priObject).getUsername();
        }
        else {
            userName = priObject.toString();
        }
        return userName;
    }


    @Override
    public <UserPasswordVM> void changePassword(UserPasswordVM userPasswordVM) {

    }

    @Override
    public UserDTO getCurrenUser() {
        String username = getPricipal();
        if (username != null)
            return userRepository.findByLogin(username).map(UserDTO::new).orElse(null);



        return null;
    }

    @Override
    public Optional<User> getByLogin(String login) {
        return  userRepository.findByLogin(login);
    }

    @Override
    public String getCurrenLogin() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
