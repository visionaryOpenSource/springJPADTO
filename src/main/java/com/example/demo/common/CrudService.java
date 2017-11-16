package com.example.demo.common;

import java.util.List;
/**
 * @author Hani Al-Hamidawi
 */
public interface CrudService<T> {

    T save(T t);

    void delete(Long id);

    List<? extends T> findAll();

    T getOne(Long id);

}
