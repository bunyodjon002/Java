package uz.maktab.IT.maktabIT.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String Surname;

    @Size(max=50,min=8)
    @NotNull
    @Column(nullable = true,unique = true)
    private String Login;
    @Size(max=50,min=8)
    @NotNull
    @Column(nullable = true,unique = true)
    private String password;

    private Boolean active;

    public User() {
    }

    public User(Long id, String name, String surname, String login, String password, Boolean active) {
        this.id = id;
        this.name = name;
        Surname = surname;
        Login = login;
        this.password = password;
        this.active = active;
    }
    @ElementCollection(targetClass = Position.class,fetch = FetchType.EAGER)
    @CollectionTable(name = "user_position",
            joinColumns = @JoinColumn(name ="user_id"))
    @Column(name="position_id")
    private Set<Position> positions;



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
