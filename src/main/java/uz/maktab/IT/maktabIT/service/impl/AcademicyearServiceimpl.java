package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Academicyear;

import uz.maktab.IT.maktabIT.repository.AcademicyearRepository;
import uz.maktab.IT.maktabIT.service.AcademicyearService;
@Service
public class AcademicyearServiceimpl implements AcademicyearService {
    @Autowired
    AcademicyearRepository academicyearRepository;

    @Override
    public Page<Academicyear> getAll(Pageable pageable) {
      return academicyearRepository.findAll(pageable);
    }

    @Override
    public Academicyear create(Academicyear data) {
        return academicyearRepository.save(data);
    }

    @Override
    public Academicyear update(Academicyear data) {
        return academicyearRepository.save(data);
    }

    @Override
    public void delete(Academicyear data) {
        academicyearRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        academicyearRepository.deleteById(id);

    }


}
