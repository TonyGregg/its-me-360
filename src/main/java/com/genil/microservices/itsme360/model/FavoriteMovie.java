package com.genil.microservices.itsme360.model;

import javax.persistence.*;

/**
 * Created by genil on 7/4/18 at 19 01
 **/
@Entity
@Table(name = "person_fav_movies")
public class FavoriteMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seen")
    private Boolean watchStatus;

    @ManyToOne
    private Person person;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @ManyToOne
    private Movie movie;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Boolean getWatchStatus() {
        return watchStatus;
    }

    public void setWatchStatus(Boolean watchStatus) {
        this.watchStatus = watchStatus;
    }
}
