package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.An_additional_lesson;
import uz.maktab.IT.maktabIT.repository.An_additional_lessonRepository;
import uz.maktab.IT.maktabIT.service.An_additional_lessonService;
@Service
public class An_additional_lessonServiceimpl implements An_additional_lessonService {
    @Autowired
    An_additional_lessonRepository anAdditionalLessonRepository;

    @Override
    public Page<An_additional_lesson> getAll(Pageable pageable) {
        return  anAdditionalLessonRepository.findAll(pageable);
    }

    @Override
    public An_additional_lesson create(An_additional_lesson data) {
        return anAdditionalLessonRepository.save(data);
    }

    @Override
    public An_additional_lesson update(An_additional_lesson data) {
        return anAdditionalLessonRepository.save(data);
    }

    @Override
    public void delete(An_additional_lesson data) {
        anAdditionalLessonRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        anAdditionalLessonRepository.deleteById(id);

    }



}
