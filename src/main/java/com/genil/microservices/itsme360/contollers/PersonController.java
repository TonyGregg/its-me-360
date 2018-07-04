package com.genil.microservices.itsme360.contollers;

import com.genil.microservices.itsme360.model.Person;
import com.genil.microservices.itsme360.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genil on 7/4/18 at 19 19
 **/

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping
    public List<Person> list() {
       return personRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Person person) {
        personRepository.save(person);

    }

    @GetMapping("/{id}")
    public Person get(@PathVariable("id") Long id) {
        return personRepository.getOne(id);
    }
}
