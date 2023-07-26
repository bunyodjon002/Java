package uz.maktab.IT.maktabIT.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String academicyearstarted;

    public Sclass() {
    }

    public Sclass(Long id, String name, String academicyearstarted) {
        this.id = id;
        this.name = name;
        this.academicyearstarted = academicyearstarted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcademicyearstarted() {
        return academicyearstarted;
    }

    public void setAcademicyearstarted(String academicyearstarted) {
        this.academicyearstarted = academicyearstarted;
    }
}
