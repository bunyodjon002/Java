package uz.maktab.IT.maktabIT.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Astudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Surname;
    private String Name_Patronymic_name;
    private LocalDate young;
    private String Login;
    private String password;

    public Astudent() {
    }

    public Astudent(Long id, String name, String surname, String name_Patronymic_name, LocalDate young, String login, String password) {
        this.id = id;
        this.name = name;
        Surname = surname;
        Name_Patronymic_name = name_Patronymic_name;
        this.young = young;
        Login = login;
        this.password = password;
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

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName_Patronymic_name() {
        return Name_Patronymic_name;
    }

    public void setName_Patronymic_name(String name_Patronymic_name) {
        Name_Patronymic_name = name_Patronymic_name;
    }

    public LocalDate getYoung() {
        return young;
    }

    public void setYoung(LocalDate young) {
        this.young = young;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
