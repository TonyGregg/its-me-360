package com.genil.microservices.itsme360.repositories;

import com.genil.microservices.itsme360.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by genil on 7/4/18 at 19 36
 **/
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    public Person findByEmail(String email);
    public Person findByName(String name);
    public Person findByEmailAndName(String email, String name);

}
