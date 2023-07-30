package uz.maktab.IT.maktabIT.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Science;
import uz.maktab.IT.maktabIT.entity.Sclass;


public interface SclassService extends Generalservice <Sclass,Number>  {
    Page<Sclass> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable);
}
