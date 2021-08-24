package com.poc.cvs.service1.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
}
