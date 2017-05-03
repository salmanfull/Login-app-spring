/**
 * 
 */
package com.full.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.full.bean.User;
import com.full.dao.UserDao;

/**
 * @author Salmankhan
 * @since 03-May-2017, 12:53:28 PM registration-app-spring
 */
@Controller
public class ControllerClass {

	private UserDao dao;

	@Autowired
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/")
	public String showIndexPage() {

		dao.populateUserData();
		return "index";

	}

	@RequestMapping("/login")
	public String showLoginPage(Model model) {

		model.addAttribute("user", new User());
		return "login";

	}

	@RequestMapping("/home")
	public String showHomePage(Model model, User user) {

		if (!dao.isUserNameAvailable(user.getUsername())) {
			model.addAttribute("usernameError", "Username does not exist");
			return "login";
		} else if (!dao.doesPasswordMatch(user.getPassword())) {
			model.addAttribute("passwordError", "Password does not match");
			return "login";
		} else {
			model.addAttribute("username", user.getUsername());
			return "home";
		}

	}

}
