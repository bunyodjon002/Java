package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import uz.maktab.IT.maktabIT.entity.Science;
import uz.maktab.IT.maktabIT.service.ScienceService;

@RestController
@RequestMapping("/science")
@CrossOrigin(origins = "*",maxAge = 3600)
public class ScienceController {
    @Autowired
    ScienceService scienceService;

    @GetMapping("/science")
    public Page<Science> getAll(@RequestParam(required = false)String key,  Pageable pageable){

        if(key ==null) key ="";
        return scienceService.getAll(pageable);
    }
    @PostMapping
    public Science create(@RequestBody Science science){
        return   scienceService.create(science);
    }
    @PutMapping
    public Science update(@RequestBody Science science){
        return scienceService.update(science);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        scienceService.deleteById(id);


    }

}
