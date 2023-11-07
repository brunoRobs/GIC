package br.com.midiavox.GIC.user;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String name;
    @Transient
    private int age;
    private String email;
    private LocalDate dayOfBirth;

    public User() {
    }

    public User(Long id, String name, String email, LocalDate dayOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dayOfBirth = dayOfBirth;
    }

    public User(String name, String email, LocalDate dayOfBirth) {
        this.name = name;
        this.email = email;
        this.dayOfBirth = dayOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Period.between(this.dayOfBirth, LocalDate.now()).getYears();
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + getAge() +
                ", email='" + email + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
