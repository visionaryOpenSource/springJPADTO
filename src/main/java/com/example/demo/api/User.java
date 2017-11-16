package com.example.demo.api;

import com.example.demo.common.Identifiable;

/**
 * @author Hani Al-Hamidawi
 */
public interface User extends Identifiable{

    String getName();

    String getLastName();

    int getAge();

}
