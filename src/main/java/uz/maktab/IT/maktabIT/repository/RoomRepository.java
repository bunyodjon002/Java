package uz.maktab.IT.maktabIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.IT.maktabIT.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository <Room,Long> {
}
