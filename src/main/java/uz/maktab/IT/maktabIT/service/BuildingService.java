package uz.maktab.IT.maktabIT.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Building;

public interface BuildingService extends Generalservice <Building,Number> {
    Page<Building> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable);
}
