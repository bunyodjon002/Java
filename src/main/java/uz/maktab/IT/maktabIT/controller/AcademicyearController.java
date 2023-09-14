package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.Academicyear;
import uz.maktab.IT.maktabIT.entity.Building;
import uz.maktab.IT.maktabIT.service.AcademicyearService;

@RestController
@RequestMapping("/Academicyeras")
@CrossOrigin(origins = "*",maxAge = 3600)
public class AcademicyearController {
    @Autowired
    AcademicyearService academicyearService;
    @GetMapping("/academcyear")
    public Page<Academicyear> getAll(@RequestParam(required = false)   Pageable pageable){

        return academicyearService.getAll(pageable);
    }
    @PostMapping
    public Academicyear create(@RequestBody Academicyear academicyear){
        return    academicyearService.create(academicyear);
    }
    @PutMapping
    public Academicyear update(@RequestBody Academicyear academicyear){
        return academicyearService.update(academicyear);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        academicyearService.deleteById(id);


    }


}
