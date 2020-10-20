package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Category;
import com.crud.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category saveCategory(Category category) {
		return repository.save(category);
	}
	
	public List<Category> saveCategories(List<Category> categories){
		return repository.saveAll(categories);
	}
	
	public List<Category> getCategories(){
		return repository.findAll();
	}
	
	public Category getCategoryById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public String deleteCategory(int id) {
		repository.deleteById(id);
		return "Category removed || "+id;
	}
	
	public Category updateCategory(Category category) {
		Category c = repository.findById(category.getId()).orElse(null);
		c.setName(category.getName());
		return repository.save(c);
	}

}
