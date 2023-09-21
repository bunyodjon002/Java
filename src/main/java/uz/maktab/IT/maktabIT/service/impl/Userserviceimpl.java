package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.User;
import uz.maktab.IT.maktabIT.repository.UserRepository;
import uz.maktab.IT.maktabIT.service.dto.UserDTO;
import uz.maktab.IT.maktabIT.service.vm.UserService;

import java.util.List;
import java.util.Optional;
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
        return Optional.empty();
    }

    @Override
    public List<UserDTO> getAll() {
        return null;
    }

    @Override
    public UserDTO update(User user) {
        return null;
    }

    @Override
    public Optional<UserDTO> getBuId(Long id) {
        return Optional.empty();
    }

    @Override
    public UserDTO create(User user) {
        return null;
    }

    @Override
    public User getCurrenUserEntity() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public <UserPasswordVM> void changePassword(UserPasswordVM userPasswordVM) {

    }

    @Override
    public UserDTO getCurrenUser() {
        return null;
    }

    @Override
    public Optional<User> getByLogin(String login) {
        return Optional.empty();
    }

    @Override
    public String getCurrenLogin() {
        return null;
    }
}
