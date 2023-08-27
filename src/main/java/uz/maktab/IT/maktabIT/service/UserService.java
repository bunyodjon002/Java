package uz.maktab.IT.maktabIT.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.maktab.IT.maktabIT.entity.Teacher;
import uz.maktab.IT.maktabIT.entity.User;

public interface UserService  extends Generalservice <User,Number>{
    Page<User> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable);
}
