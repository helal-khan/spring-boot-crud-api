package com.crud;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import javax.annotation.security.RunAs;
import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud.model.Category;
import com.crud.repository.CategoryRepository;

@SpringBootTest
@DataJpaTest
class CategoryRepositoryTest {
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private CategoryRepository repository;

	@Test
	void createCategoryTest() {
		
		Category cat = this.getCategory();
		Category savedCat = testEntityManager.persist(cat);
		Optional<Category> getCat = repository.findById(savedCat.getId());
		//Assertions.assertThat(savedCat).isEqualTo(getCat);
		//assertThat(savedCat, getCat);
		
	}
	
	private Category getCategory() {
		Category cat = new Category();
		cat.setName("Speaker");
		return cat;
	}

}
