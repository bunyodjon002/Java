package uz.maktab.IT.maktabIT.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.maktab.IT.maktabIT.entity.Teacher;

public interface TeacherService extends Generalservice <Teacher,Number>{
    Page<Teacher> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable);
}
