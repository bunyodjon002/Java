package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.Science;
import uz.maktab.IT.maktabIT.entity.Sclass;
import uz.maktab.IT.maktabIT.service.SclassService;

@RestController
@RequestMapping("/sclass")
@CrossOrigin(origins = "*",maxAge = 3600)
public class SclassController {
    @Autowired
   SclassService sclassService;

    @GetMapping
    public Page<Sclass> getAll(@RequestParam(required = false) Pageable pageable){
        return sclassService.getAll(pageable);
    }
    @PostMapping
    public Sclass create(@RequestBody Sclass sclass){
        return   sclassService.create(sclass);
    }
    @PutMapping
    public Sclass update(@RequestBody Sclass sclass){
    return sclassService.update(sclass);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        sclassService.deleteById(id);


    }

}
