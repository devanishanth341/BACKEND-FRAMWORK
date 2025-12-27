package com.examly.springapp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Category;
import com.examly.springapp.repository.CategoryRepo;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo repo;

    public Category addCategory(Category category){
        return repo.save(category);
    }

    public List<Category> getAllCategory(){
        return repo.findAll();
    }

    public Optional<Category> getById(Long categoryId){
        return repo.findById(categoryId);
    }
}
