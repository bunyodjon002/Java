package uz.maktab.IT.maktabIT.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.maktab.IT.maktabIT.entity.Building;
import uz.maktab.IT.maktabIT.entity.Science;

public interface ScienceService extends Generalservice <Science,Number>{
    Page<Science> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable);
}
