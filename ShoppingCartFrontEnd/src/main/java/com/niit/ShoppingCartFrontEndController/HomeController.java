package com.niit.ShoppingCartFrontEndController;

	import javax.servlet.http.HttpSession;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

	@Controller
	public class HomeController {

		@Autowired
		private UserDAO userDAO;
		
		@Autowired
		private User user;
		
		@Autowired
		private HttpSession session;

		@RequestMapping("/")
		public ModelAndView showHome() {
			System.out.println("Starting the method showHome");
			ModelAndView mv = new ModelAndView("/Home");
			mv.addObject("msg", "Welcome to my cart");
			return mv;
		}

		@RequestMapping("/Login")
		public ModelAndView showLogin() {
			System.out.println("Inside Login Page");
			ModelAndView mv = new ModelAndView("/Login");
			mv.addObject("isUserClickedLogin", "true");
			return mv;
		}

		@RequestMapping("/Register")
		public ModelAndView showRegistration() {
			System.out.println("Inside Registration Page");
			ModelAndView mv = new ModelAndView("/Registration");
			mv.addObject("isUserClickedRegister", "true");
			return mv;
		}

		 @RequestMapping("/validate")
		
		public ModelAndView validateCredentials(@RequestParam("userID") String id, @RequestParam("password") String pwd) {

			// get data from database

			ModelAndView mv = new ModelAndView("/Home");

			if (userDAO.validate(id, pwd)==true)
			{
				userDAO.getUser(id);
				
				if(user.getRole().equals("Role_Admin"))
				{
					mv.addObject("role", "Admin");
				}
				else
				{
					mv.addObject("role", "Customer");
				}
				mv.addObject("successMessage", "Valid Credentials");
				session.setAttribute("loginMessage", "Welcome " + id);
			} else {
				mv.addObject("errorMessage", "Invalid Credentials.. Try Again!");
			}

			return mv;

		}

		@RequestMapping("/Logout")
		public ModelAndView logout() {
			ModelAndView mv = new ModelAndView("/Home");
			// session.invalidate();
			session.removeAttribute("loginMessage");
			return mv;
		}
}
