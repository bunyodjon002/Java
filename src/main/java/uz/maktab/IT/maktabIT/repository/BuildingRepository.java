package uz.maktab.IT.maktabIT.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Building;

@Repository
public interface BuildingRepository extends JpaRepository <Building ,Long>
{
    Page<Building> findAllByNameContainsIgnoreCaseOrId(String key , Long id, Pageable pageable);
}
