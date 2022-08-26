package it.develhope.Logging01.controllers;

import it.develhope.Logging01.services.BasicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private BasicServices basicServices;

    @GetMapping("/")
    public String welcome() {
        return basicServices.welcome();
    }

    @GetMapping("/exp")
    public String power() {
        return basicServices.getPower();
    }

    @GetMapping("/get-errors")
    public String getErrors() {
        return basicServices.getError();
    }
}
