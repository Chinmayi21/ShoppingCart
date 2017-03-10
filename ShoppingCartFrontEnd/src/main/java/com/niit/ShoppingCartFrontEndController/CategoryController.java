package com.niit.ShoppingCartFrontEndController;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

public class CategoryController {

	@Autowired
	private Category category;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	
}
