package com.example.demo.controller;

import com.codiform.moo.curry.Translate;
import com.example.demo.api.User;
import com.example.demo.resource.UserResource;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


/**
 * @author Hani Al-Hamidawi
 */
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(path = "/users")
    public List<UserResource> getAll(){
        List<? extends User> users = this.userService.findAll();
        return Translate.to(UserResource.class).fromEach(users);
    }


}
