package uz.maktab.IT.maktabIT.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Science;

@Repository
public interface ScienceRepository extends JpaRepository <Science,Long> {
    Page<Science> findAllByNameContainsIgnoreCaseOrId(String key , Long id, Pageable pageable);

}
