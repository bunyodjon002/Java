package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.Room;
import uz.maktab.IT.maktabIT.entity.Science;
import uz.maktab.IT.maktabIT.service.RoomService;

@RestController
@RequestMapping("/room")
@CrossOrigin(origins = "*",maxAge = 3600)
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping
    public Page<Room> getAll(@RequestParam(required = false) Pageable pageable){
        return roomService.getAll(pageable);
    }
    @PostMapping
    public Room create(@RequestBody Room room){
        return   roomService.create(room);
    }
    @PutMapping
    public Room update(@RequestBody Room room){
        return roomService.update(room);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        roomService.deleteById(id);


    }


}