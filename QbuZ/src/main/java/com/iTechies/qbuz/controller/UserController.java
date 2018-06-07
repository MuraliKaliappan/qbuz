package com.iTechies.qbuz.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iTechies.model.Signup;
import com.iTehcies.service.UserService;

@Controller
@RequestMapping(value = "user/")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	private UserService userService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String showSignupView() {
		return "user_signup";
	}

	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public void processSignupView(@ModelAttribute Signup signup,HttpServletResponse response,HttpServletRequest request) throws IOException {
		logger.info("entity" + signup.toString());
		userService.addUser(signup);
		response.sendRedirect(request.getContextPath()+"/");
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
