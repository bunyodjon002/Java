package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.User;
import uz.maktab.IT.maktabIT.service.dto.UserDTO;
import uz.maktab.IT.maktabIT.service.vm.UserService;

import java.util.List;

@RestController
@PreAuthorize("hasAnyAuthority(\"ADMIN\", \"MANAGER\" , \"Users\")")
@RequestMapping("api/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    UserService userService;

  @GetMapping
    public List<UserDTO> getall(){
      return userService.getAll();
  }

    @PostMapping
    public UserDTO create(@RequestBody User user){
        return userService.create(user);

    }
//    @PostMapping(consumes = "application/json")
//    void addUser(@RequestBody User user) {
//        userService.saveUser(User);
//    }

    @PutMapping
    public UserDTO update(@RequestBody User user){
        return userService.update(user);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }





}
