package com.yan.ferreira.cursospringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yan.ferreira.cursospringboot.entities.Category;
import com.yan.ferreira.cursospringboot.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> cat = repository.findById(id);
        return cat.get();
    }
}
