package uz.maktab.IT.maktabIT.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.maktab.IT.maktabIT.entity.Sclass;
import uz.maktab.IT.maktabIT.entity.Teacher;

public interface TeacherRepository extends JpaRepository <Teacher,Long> {

    Page<Teacher> findAllByNameContainsIgnoreCaseOrId(String key , Long id, Pageable pageable);

}
