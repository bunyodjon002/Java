package uz.maktab.IT.maktabIT.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Room;

public interface RoomService  extends Generalservice <Room,Number>{
    Page<Room> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable);
}
