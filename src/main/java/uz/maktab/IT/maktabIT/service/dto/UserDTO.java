package uz.maktab.IT.maktabIT.service.dto;
import java.util.Set;

import uz.maktab.IT.maktabIT.entity.User;

public class UserDTO {
    private Long id;
    private String name;
    private String surname;
    private String Login;
    private String password;
    private Boolean active;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String surname, String login, String password, Boolean active) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        Login = login;
        this.password = password;
        this.active = active;
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
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
