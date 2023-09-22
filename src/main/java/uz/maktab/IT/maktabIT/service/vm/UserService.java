package uz.maktab.IT.maktabIT.service.vm;

import uz.maktab.IT.maktabIT.entity.User;
import uz.maktab.IT.maktabIT.service.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public Optional<User> getByIdEntity(Long id);

    public List<UserDTO> getAll();

    UserDTO update(User user);

    public Optional<UserDTO> getById(Long id);

    UserDTO create(User user);

    User getCurrenUserEntity();

    public void deleteById(Long id);
    public <UserPasswordVM> void changePassword(UserPasswordVM userPasswordVM);

    UserDTO getCurrenUser();


    Optional<User> getByLogin(String login);

    public String getCurrenLogin();

}
