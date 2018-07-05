package com.genil.microservices.itsme360.contollers;

import com.genil.microservices.itsme360.model.Person;
import com.genil.microservices.itsme360.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonRepository personRepository;

    @GetMapping
    public List<Person> list() {
       return personRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Person person) {
        logger.info("Person info passed "+person);
        personRepository.save(person);
        logger.info("Person persisted into DB !");

    }

    @GetMapping("/{id}")
    public Person get(@PathVariable("id") Long id) {
        return personRepository.getOne(id);
    }

    @GetMapping("/findByEmailId")
    public Person findByEmail(@RequestParam String email) {
        return personRepository.findByEmail(email);
    }

    @GetMapping("/findByName")
    public Person findPersonByName(@RequestParam String name) {
        return personRepository.findByName(name);
    }

    @GetMapping("/findByEmailAndName")
    public Person findByEmailAndName(@RequestParam String email, @RequestParam String name) {
        return personRepository.findByEmailAndName(email,name);
    }
}
