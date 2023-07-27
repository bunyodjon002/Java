package uz.maktab.IT.maktabIT.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import uz.maktab.IT.maktabIT.entity.Astudent;



@Repository
public interface AstudentRepository  extends JpaRepository <Astudent,Long> {

}
