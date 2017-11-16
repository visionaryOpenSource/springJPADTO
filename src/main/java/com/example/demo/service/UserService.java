package com.example.demo.service;

import com.example.demo.api.User;
import com.example.demo.common.Builder;
import com.example.demo.common.CrudService;

import java.util.List;

/**
 * @author Hani Al-Hamidawi
 */
public interface UserService extends CrudService<User> {

    List<User> findAllByName(String name);

    UserBuilder build(String name);

    static interface UserBuilder extends Builder<User>{

    }
}
