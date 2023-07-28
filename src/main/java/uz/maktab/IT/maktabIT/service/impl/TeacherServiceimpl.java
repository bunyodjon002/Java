package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Teacher;

import uz.maktab.IT.maktabIT.repository.TeacherRepository;
import uz.maktab.IT.maktabIT.service.TeacherService;
@Service
public class TeacherServiceimpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public Page<Teacher> getAll(Pageable pageable) {
        return teacherRepository.findAll(pageable);
    }

    @Override
    public Teacher create(Teacher data) {
        return teacherRepository.save(data);
    }

    @Override
    public Teacher update(Teacher data) {
        return  teacherRepository.save(data);
    }

    @Override
    public void delete(Teacher data) {
    teacherRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        teacherRepository.deleteById(id);

    }
}
