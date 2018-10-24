package com.genil.microservices.itsme360.repositories;

import com.genil.microservices.itsme360.model.Person;
import com.genil.microservices.itsme360.model.ToDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by genil on 10/23/18 at 19 24
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonRepository personRepository;

    @Test
    @Transactional
    public void findByEmail() {
        Person person =  personRepository.findByEmail("Shenil1@gmail.com");
        List<ToDo> todoList =  person.getToDos();

        for (ToDo todo : todoList) {
            logger.info("Todo {} ",todo );
        }

    }

    @Test
    public void findByName() {
    }

    @Test
    public void findByEmailAndName() {
    }
}