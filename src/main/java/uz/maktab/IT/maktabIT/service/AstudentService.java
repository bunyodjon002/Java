package uz.maktab.IT.maktabIT.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Astudent;


public interface AstudentService extends Generalservice <Astudent,Number> {

    Page<Astudent> findAllByNameContainsIgnoreCaseOrId(String key , Pageable pageable);

}
