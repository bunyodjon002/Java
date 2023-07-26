package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.Building;
import uz.maktab.IT.maktabIT.service.BuildingService;

@RestController
@RequestMapping("/building")
@CrossOrigin(origins = "*",maxAge = 3600)
public class BuildingController {


    @Autowired
    BuildingService buildingService;
  @GetMapping
    public Page<Building> getAll(@RequestParam(required = false)Pageable pageable){
      return buildingService.getAll(pageable);
  }
  @PostMapping
    public Building create(@RequestBody Building building){
     return    buildingService.create(building);
  }
@PutMapping
    public Building update(@RequestBody Building building){
      return buildingService.update(building);
}
@DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
      buildingService.deleteById(id);


    }
}
