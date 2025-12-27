package com.examly.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Category;
import com.examly.springapp.service.CategoryService;


@RestController
@RequestMapping("/api/categories")

public class CategoryController {
    

    @Autowired
    private CategoryService ser;

    @PostMapping
    public ResponseEntity<Category> addCategory(@RequestBody Category category){
        Category k=ser.addCategory(category);
        return new ResponseEntity<>(k,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategory(){
        List<Category> j=ser.getAllCategory();
        return new ResponseEntity<>(j,HttpStatus.OK);
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<Optional<Category>> getById(@PathVariable Long categoryId){
        Optional<Category> h=ser.getById(categoryId);
        return new ResponseEntity<>(h,HttpStatus.OK);
    }
}
