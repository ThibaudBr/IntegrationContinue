package org.example.entity;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    private String email;
    private String name;
    private String surname;
    private LocalDate birthDate;

    public User(String email, String name, String surname, LocalDate birthDate) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    public boolean isValid(){
        return !Objects.equals(this.name, "")
                && !Objects.equals(this.name, null)
                && !Objects.equals(this.surname, "")
                && !Objects.equals(this.surname, null)
                && this.birthDate.isBefore(LocalDate.now().minusYears(13))
                && this.email.matches("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");
    }
}
