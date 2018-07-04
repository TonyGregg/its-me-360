package com.genil.microservices.itsme360.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

/**
 * Created by genil on 7/4/18 at 18 32
 **/
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "person")
    private List<Phone> phones;

    @OneToMany(mappedBy = "person")
    private List<ToDo> toDos;


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void addTodo(ToDo toDo) {
        this.toDos.add(toDo);
    }




}
