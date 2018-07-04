package com.genil.microservices.itsme360.model;

import javax.persistence.*;

/**
 * Created by genil on 7/4/18 at 18 39
 **/
@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    @Column(name = "num")
    private String phoneNumber;

    @ManyToOne
    private Person person;

    public Long getId() {
        return id;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
