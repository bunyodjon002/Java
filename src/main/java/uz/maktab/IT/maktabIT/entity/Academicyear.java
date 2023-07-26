package uz.maktab.IT.maktabIT.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Academicyear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate  starttime;
    private LocalDate  timeisover;


    public Academicyear() {
    }

    public Academicyear(Long id, LocalDate starttime, LocalDate timeisover) {
        this.id = id;
        this.starttime = starttime;
        this.timeisover = timeisover;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDate starttime) {
        this.starttime = starttime;
    }

    public LocalDate getTimeisover() {
        return timeisover;
    }

    public void setTimeisover(LocalDate timeisover) {
        this.timeisover = timeisover;
    }
}
