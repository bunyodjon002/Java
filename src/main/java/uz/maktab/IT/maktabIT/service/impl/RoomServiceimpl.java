package uz.maktab.IT.maktabIT.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Room;
import uz.maktab.IT.maktabIT.repository.RoomRepository;
import uz.maktab.IT.maktabIT.service.RoomService;
@Service
public class RoomServiceimpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;
    @Override
    public Page<Room> getAll(Pageable pageable) {
        return  roomRepository.findAll(pageable);
    }

    @Override
    public Room create(Room data) {
        return roomRepository.save(data);
    }

    @Override
    public Room update(Room data) {
        return roomRepository.save(data);
    }

    @Override
    public void delete(Room data) {
 roomRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        roomRepository.deleteById(id);

    }
    @Override
    public Page<Room> findAllByNameContainsIgnoreCaseOrId(String key, Pageable pageable) {
        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return roomRepository.findAllByNameContainsIgnoreCaseOrId(key , n ,pageable);
        }  catch (Exception f){
            return roomRepository.findAllByNameContainsIgnoreCaseOrId(key,(long) -1,pageable);
        }
    }


}
