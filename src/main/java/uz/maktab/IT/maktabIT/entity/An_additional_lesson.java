package uz.maktab.IT.maktabIT.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class An_additional_lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate hour;
    @ManyToOne
    private Science science;
    @ManyToOne
    private  Teacher teacher;

    public An_additional_lesson() {
    }

    public An_additional_lesson(Long id, LocalDate hour, Science science, Teacher teacher) {
        this.id = id;
        this.hour = hour;
        this.science = science;
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getHour() {
        return hour;
    }

    public void setHour(LocalDate hour) {
        this.hour = hour;
    }

    public Science getScience() {
        return science;
    }

    public void setScience(Science science) {
        this.science = science;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
