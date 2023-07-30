package uz.maktab.IT.maktabIT.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.IT.maktabIT.entity.Astudent;
import uz.maktab.IT.maktabIT.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository <Room,Long> {

    Page<Room> findAllByNameContainsIgnoreCaseOrId(String key , Long id, Pageable pageable);

}
