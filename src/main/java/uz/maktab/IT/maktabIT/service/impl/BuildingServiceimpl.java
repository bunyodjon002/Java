package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Building;
import uz.maktab.IT.maktabIT.repository.BuildingRepository;
import uz.maktab.IT.maktabIT.service.BuildingService;

@Service
public class BuildingServiceimpl implements BuildingService {


    @Autowired
    BuildingRepository buildingRepository;

    @Override
    public Page<Building> getAll(Pageable pageable) {
        return buildingRepository.findAll(pageable);
    }

    @Override
    public Building create(Building data) {
        return buildingRepository.save(data);
    }

    @Override
    public Building update(Building data) {
        return buildingRepository.save(data);
    }

    @Override
    public void delete(Building data) {
buildingRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
 buildingRepository.deleteById(id);
    }
}
