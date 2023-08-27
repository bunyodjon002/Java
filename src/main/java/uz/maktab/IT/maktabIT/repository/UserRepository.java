package uz.maktab.IT.maktabIT.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import uz.maktab.IT.maktabIT.entity.Position;
import uz.maktab.IT.maktabIT.entity.Teacher;
import uz.maktab.IT.maktabIT.entity.User;

import java.util.List;
import java.util.Optional;
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Long> {


    Page<User> findAllByNameContainsIgnoreCaseOrId(String key , Long id, Pageable pageable);

    Optional<User> findByLogin(String username);



}
