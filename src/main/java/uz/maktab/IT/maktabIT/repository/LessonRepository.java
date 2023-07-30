package uz.maktab.IT.maktabIT.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Lesson;
@Repository
public interface LessonRepository extends JpaRepository <Lesson,Long> {




}
