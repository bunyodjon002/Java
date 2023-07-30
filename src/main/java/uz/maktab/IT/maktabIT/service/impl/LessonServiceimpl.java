package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Lesson;
import uz.maktab.IT.maktabIT.repository.LessonRepository;
import uz.maktab.IT.maktabIT.service.LessonService;
@Service
public class LessonServiceimpl implements LessonService {
    @Autowired
    LessonRepository lessonRepository;
    @Override
    public Page<Lesson> getAll(Pageable pageable) {
        return lessonRepository.findAll(pageable);
    }

    @Override
    public Lesson create(Lesson data) {
        return lessonRepository.save(data);
    }

    @Override
    public Lesson update(Lesson data) {
        return lessonRepository.save(data);
    }

    @Override
    public void delete(Lesson data) {
        lessonRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        lessonRepository.deleteById(id);

    }



}
