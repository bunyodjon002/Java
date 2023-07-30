package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Sclass;
import uz.maktab.IT.maktabIT.repository.SclassRepository;
import uz.maktab.IT.maktabIT.service.SclassService;
@Service
public class SclassServiceimpl implements SclassService {
    @Autowired
    SclassRepository sclassRepository;

    @Override
    public Page<Sclass> getAll(Pageable pageable) {
        return sclassRepository.findAll(pageable);
    }

    @Override
    public Sclass create(Sclass data) {
        return sclassRepository.save(data);
    }

    @Override
    public Sclass update(Sclass data) {
        return sclassRepository.save(data);
    }

    @Override
    public void delete(Sclass data) {
        sclassRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        sclassRepository.deleteById(id);

    }
    @Override
    public Page<Sclass> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable) {
        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return sclassRepository.findAllByNameContainsIgnoreCaseOrId(key , n ,pageable);
        }  catch (Exception f){
            return sclassRepository.findAllByNameContainsIgnoreCaseOrId(key,(long) -1,pageable);
        }
    }


}
