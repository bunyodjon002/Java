package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Science;
import uz.maktab.IT.maktabIT.repository.ScienceRepository;
import uz.maktab.IT.maktabIT.service.ScienceService;
@Service
public class ScienceServiceimpl implements ScienceService {

    @Autowired
    ScienceRepository scienceRepository;


    @Override
    public Page<Science> getAll(Pageable pageable) {
        return scienceRepository.findAll(pageable);
    }

    @Override
    public Science create(Science data) {
        return scienceRepository.save(data);
    }

    @Override
    public Science update(Science data) {
        return scienceRepository.save(data);
    }

    @Override
    public void delete(Science data) {
     scienceRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        scienceRepository.deleteById(id);

    }
}
