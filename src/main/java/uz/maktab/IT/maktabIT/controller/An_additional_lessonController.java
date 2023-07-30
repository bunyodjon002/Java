package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.An_additional_lesson;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Building;
import uz.maktab.IT.maktabIT.service.An_additional_lessonService;

@RestController
@RequestMapping("/an_additional")
@CrossOrigin(origins = "*",maxAge = 3600)
public class An_additional_lessonController {

    @Autowired
    An_additional_lessonService anAdditionalLessonService;
    @GetMapping
    public Page<An_additional_lesson> getAll(@RequestParam(required = false)  Pageable pageable){

        return anAdditionalLessonService.getAll(pageable);
    }
    @PostMapping
    public An_additional_lesson create(@RequestBody An_additional_lesson An_additional_lesson){
        return    anAdditionalLessonService.create( An_additional_lesson);
    }
    @PutMapping
    public An_additional_lesson update(@RequestBody An_additional_lesson an_additional_lesson){
        return anAdditionalLessonService.update(an_additional_lesson);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        anAdditionalLessonService.deleteById(id);


    }

}
