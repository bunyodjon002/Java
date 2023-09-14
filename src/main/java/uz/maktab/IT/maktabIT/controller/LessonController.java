package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.Building;
import uz.maktab.IT.maktabIT.entity.Lesson;
import uz.maktab.IT.maktabIT.service.LessonService;

@RestController
@RequestMapping("/lessons")
@CrossOrigin(origins = "*",maxAge = 3600)
public class LessonController {
    @Autowired
    LessonService lessonService;
    @GetMapping("/lesson")
    public Page<Lesson> getAll(@RequestParam(required = false)   Pageable pageable){

        return lessonService.getAll(pageable);
    }

    @PostMapping
    public Lesson create(@RequestBody Lesson lesson){
        return    lessonService.create(lesson);
    }

    @PutMapping
    public Lesson update(@RequestBody Lesson lesson){
        return lessonService.update(lesson);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        lessonService.deleteById(id);


    }


}

