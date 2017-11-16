package com.example.demo.service.impl;

import com.example.demo.api.User;
import com.example.demo.jpa.UserJpa;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hani Al-Hamidawi
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllByName(String name) {
        return this.userRepository.findAllByName(name);
    }

    @Override
    public UserBuilder build(String name) {
        return null;
    }

    @Override
    public User save(User user) {
        return this.userRepository.save((UserJpa) user);
    }

    @Override
    public void delete(Long id) {
        this.userRepository.delete(id);
    }

    @Override
    public List<? extends User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User getOne(Long id) {
        return this.userRepository.findOne(id);
    }

    private class Builder implements UserBuilder {

        private final String name;
        private String lastName;
        private int age;

        public Builder(String name){
            this.name = name;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        @Override
        public User build() {
            UserJpa user = new UserJpa();
            user.setName(name);
            user.setAge(age);
            user.setLastName(lastName);
            return user;
        }
    }
}
