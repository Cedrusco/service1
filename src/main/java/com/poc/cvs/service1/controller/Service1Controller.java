package com.poc.cvs.service1.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class Service1Controller {

    @GetMapping(value = "/service1", produces = {"application/json"})
    public ResponseEntity<List<User>> getList() {
        List<User> service1DomainList = new ArrayList<User>();
        service1DomainList.add(new User(1, "firstname1",
                "lastname1", "firstname1.lastname1@test,com", "M"));
        service1DomainList.add(new User(2, "firstname2",
                "lastname2", "firstname2.lastname2@test,com", "F"));
        service1DomainList.add(new User(3, "firstname3",
                "lastname3", "firstname3.lastname3@test,com", "M"));

        return new ResponseEntity<>(service1DomainList, HttpStatus.OK);
    }

    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }
}
