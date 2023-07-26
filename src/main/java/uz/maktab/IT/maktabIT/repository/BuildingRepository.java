package uz.maktab.IT.maktabIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.IT.maktabIT.entity.Building;

@Repository
public interface BuildingRepository extends JpaRepository <Building ,Long> {
}
