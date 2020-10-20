package com.crud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Category;
import com.crud.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryService service;

	@PostMapping("/create-category")
	public ResponseEntity<Category> createCategory(@RequestBody @Valid Category category) {
		//return new ResponseEntity<Category>(service.saveCategory(category), HttpStatus.CREATED);
		return new ResponseEntity<>(service.saveCategory(category), HttpStatus.CREATED);
		//return new ResponseEntity<>(HttpStatus.CREATED); //if void
		//return ResponseEntity.status(HttpStatus.CREATED).body(service.saveCategory(category));
	}
	
	@PostMapping("/create-categories")
	public ResponseEntity<List<Category>> createCategories(@RequestBody @Valid List<Category> categories) {
		return new ResponseEntity<>(service.saveCategories(categories), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> getCategories() {
		return new ResponseEntity<>(service.getCategories(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable int id) {
		return new ResponseEntity<>(service.getCategoryById(id), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Category> updateCategory(@RequestBody @Valid Category category) {
		return new ResponseEntity<>(service.updateCategory(category), HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable int id) {
		return new ResponseEntity<>(service.deleteCategory(id), HttpStatus.OK);
	}
	

}
