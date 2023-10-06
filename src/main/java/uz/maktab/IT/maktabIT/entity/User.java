package uz.maktab.IT.maktabIT.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
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

//    @Size(max=50,min=60)
//    @NotNull
//    @Column(unique = true,nullable = true)
//    private String Login;
    //tog'ilangan ushub kodlarga tegilmasin!!!!!
@Column(name = "login",unique = true,nullable = false)
private String login;
    @Size(max=30,min=60)
    @NotNull
    @Column(unique = true,nullable = false)
    private String password;

    private Boolean active;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @ElementCollection(targetClass = Position.class,fetch = FetchType.EAGER)
    @CollectionTable(name = "user_position",
            joinColumns = @JoinColumn(name ="user_id"))
    @Column(name="position_id")
    private Set<Position> positions;
//    public User(Long id, String name, String surname, String login, String password, Boolean active) {
//        this.id = id;
//        this.name = name;
//        Surname = surname;
//        login = login;
//        this.password = password;
//        this.active = active;
//    }
    public Set<Position> getPositions() {
        return positions;
    }

    public void setPositions(Set<Position> positions) {
        this.positions = positions;
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

//    public String getlogin() {
//        return login;
//    }
//
//    public void setlogin(String login) {
//        login = login;
//    }

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
