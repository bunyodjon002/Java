package uz.maktab.IT.maktabIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.maktab.IT.maktabIT.entity.Room;
import uz.maktab.IT.maktabIT.entity.Science;
import uz.maktab.IT.maktabIT.service.RoomService;

@RestController
@RequestMapping("/room/rooms")
@CrossOrigin(origins = "*",maxAge = 3600)
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("/rooms")
    public Page<Room> getAll(@RequestParam(required = false) String key, Pageable pageable){
        if(key ==null) key ="";

        return roomService.getAll(pageable);
    }
    @PostMapping("/room/create")
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
