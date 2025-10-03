package com.mika.restful_web_services.user;

import java.time.LocalDate;

public class User {
    private Integer id;
    private String name;
    private LocalDate birthDate;

    public User(Integer id, String name, LocalDate birthDate) {
        super();
        this.birthDate = birthDate;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User[ " + "id= " + this.id + " name= " + this.name + " birthDate= " + this.birthDate + "]";
    }

}
