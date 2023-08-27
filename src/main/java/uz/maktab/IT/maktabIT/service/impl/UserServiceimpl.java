package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Position;
import uz.maktab.IT.maktabIT.entity.User;
import uz.maktab.IT.maktabIT.repository.UserRepository;
import uz.maktab.IT.maktabIT.service.UserService;
import uz.maktab.IT.maktabIT.service.dto.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceimpl  implements UserService {

    @Autowired
    UserRepository userRepository;



    @Override
    public Page<User> getAll(Pageable pageable) {
        return  userRepository.findAll(pageable);
    }

    @Override
    public User create(User data) {
        return userRepository.save(data);
    }

    @Override
    public User update(User data) {
        return userRepository.save(data);
    }

    @Override
    public void delete(User data) {
userRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public Page<User> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable) {
        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return userRepository.findAllByNameContainsIgnoreCaseOrId(key , n ,pageable);
        }  catch (Exception f){
            return userRepository.findAllByNameContainsIgnoreCaseOrId(key,(long) -1,pageable);
        }
    }
}
