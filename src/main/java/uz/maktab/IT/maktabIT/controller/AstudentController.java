package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Building;
import uz.maktab.IT.maktabIT.service.AstudentService;

@RestController
@RequestMapping("/studentss")
@CrossOrigin(origins = "*",maxAge = 3600)
public class AstudentController {
    @Autowired
    AstudentService astudentService;
    @GetMapping("astudent")
    public Page<Astudent> getAll(@RequestParam(required = false) String key, Pageable pageable){
        if(key ==null) key ="";
        return astudentService.getAll(pageable);
    }

    @PostMapping
    public Astudent create(@RequestBody Astudent astudent){
        return astudentService.create(astudent);
    }
    @PutMapping
    public Astudent update(@RequestBody Astudent astudent){
        return astudentService.update(astudent);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        astudentService.deleteById(id);


    }

}
