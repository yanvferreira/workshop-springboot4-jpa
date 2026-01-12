package com.yan.ferreira.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yan.ferreira.cursospringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
