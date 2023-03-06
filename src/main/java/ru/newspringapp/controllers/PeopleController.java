package ru.newspringapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.newspringapp.dao.PersonDAO;

@RestController
@RequestMapping("/people")
public class PeopleController {
    public final PersonDAO personDAO;

    public PeopleController(PersonDAO libraryDAO) {
        this.personDAO = libraryDAO;
    }
}
