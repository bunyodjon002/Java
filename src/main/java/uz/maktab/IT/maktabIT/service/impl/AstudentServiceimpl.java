package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.repository.AstudentRepository;
import uz.maktab.IT.maktabIT.service.AstudentService;
@Service
public class AstudentServiceimpl implements AstudentService {

   @Autowired
    AstudentRepository astudentRepository;
    @Override
    public Page<Astudent> getAll(Pageable pageable) {
        return astudentRepository.findAll(pageable);
    }

    @Override
    public Astudent create(Astudent data) {
        return astudentRepository.save(data);
    }

    @Override
    public Astudent update(Astudent data) {
        return astudentRepository.save(data);
    }

    @Override
    public void delete(Astudent data) {
 astudentRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        astudentRepository.deleteById(id);

    }


    @Override
    public Page<Astudent> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable) {
        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return astudentRepository.findAllByNameContainsIgnoreCaseOrId(key , n ,pageable);
        }  catch (Exception f){
            return astudentRepository.findAllByNameContainsIgnoreCaseOrId(key,(long) -1,pageable);
        }
    }
}
