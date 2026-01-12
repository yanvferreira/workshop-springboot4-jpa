package com.yan.ferreira.cursospringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yan.ferreira.cursospringboot.entities.Product;
import com.yan.ferreira.cursospringboot.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> listProd = service.findAll();
        return ResponseEntity.ok().body(listProd);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product prod = service.findById(id);
        return ResponseEntity.ok().body(prod);
    }
    
}
