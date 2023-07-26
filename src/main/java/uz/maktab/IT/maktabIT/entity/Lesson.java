package uz.maktab.IT.maktabIT.entity;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Astudent astudent;
    @ManyToOne
    private Teacher teacher;
    @ManyToOne
    private Science science;
    @ManyToOne
    private  Room room;

    @ManyToOne
    private  An_additional_lesson an_additional_lesson;
    @ManyToOne
    private Sclass sclass;

    public Lesson() {
    }

    public Lesson(Long id, Astudent astudent, Teacher teacher, Science science, Room room, An_additional_lesson an_additional_lesson, Sclass sclass) {
        this.id = id;
        this.astudent = astudent;
        this.teacher = teacher;
        this.science = science;
        this.room = room;
        this.an_additional_lesson = an_additional_lesson;
        this.sclass = sclass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Astudent getAstudent() {
        return astudent;
    }

    public void setAstudent(Astudent astudent) {
        this.astudent = astudent;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Science getScience() {
        return science;
    }

    public void setScience(Science science) {
        this.science = science;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public An_additional_lesson getAn_additional_lesson() {
        return an_additional_lesson;
    }

    public void setAn_additional_lesson(An_additional_lesson an_additional_lesson) {
        this.an_additional_lesson = an_additional_lesson;
    }

    public Sclass getSclass() {
        return sclass;
    }

    public void setSclass(Sclass sclass) {
        this.sclass = sclass;
    }
}
