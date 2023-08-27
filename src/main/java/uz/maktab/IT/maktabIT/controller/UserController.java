package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.Teacher;
import uz.maktab.IT.maktabIT.entity.User;
import uz.maktab.IT.maktabIT.service.UserService;

@RestController
@RequestMapping( "/users")
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public Page<User> getAll(@RequestParam(required = false) String key, Pageable pageable){
        if(key ==null) key ="";
        return userService.getAll(pageable);
    }
    @PostMapping
    public User create(@RequestBody User user){
        return   userService.create(user);
    }
    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);


    }
}

