package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import uz.maktab.IT.maktabIT.entity.Sclass;
import uz.maktab.IT.maktabIT.entity.Teacher;
import uz.maktab.IT.maktabIT.service.TeacherService;

@RestController
@RequestMapping("/teachers")
@CrossOrigin(origins = "*",maxAge = 3600)
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping
    public Page<Teacher> getAll(@RequestParam(required = false) Pageable pageable){
        return teacherService.getAll(pageable);
    }
    @PostMapping
    public Teacher create(@RequestBody Teacher teacher){
        return   teacherService.create(teacher);
    }

    @PutMapping
    public Teacher update(@RequestBody Teacher teacher){
        return teacherService.update(teacher);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        teacherService.deleteById(id);


    }


}
