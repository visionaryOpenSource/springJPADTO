package com.example.demo.repository;

import com.example.demo.api.User;
import com.example.demo.jpa.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * @author Hani Al-Hamidawi
 */
public interface UserRepository extends JpaRepository<UserJpa, Long> {


    List<User> findAllByName(String name);
}
