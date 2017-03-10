package com.niit.ShoppingCartFrontEndController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

@Controller
public class AdminController {

	//defining the methods
	
	// to get the categories
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	
	@RequestMapping("/manage_categories")
	public ModelAndView manageCategories(){
		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		mv.addObject("isUserClickedCatgories", "true");
		return mv;
	}
	@RequestMapping("/manage_suppliers")
	public ModelAndView manageSuppliers(){
		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		mv.addObject("isUserClickedSuppliers", "true");
		return mv;
	}
	@RequestMapping("/manage_products")
	public ModelAndView manageProducts(){
		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		mv.addObject("isUserClickedProducts", "true");
		return mv;
	}
	
}
