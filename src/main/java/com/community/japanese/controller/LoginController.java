package com.community.japanese.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.community.japanese.dto.LoginDTO;
import com.community.japanese.service.Interface.LoginService;
import com.community.japanese.vo.User;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(method = RequestMethod.GET, value="/formPage")
	String loginPage() {
		return "root.login.loginForm";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/process")
	void loginProcess(@RequestBody LoginDTO dto) throws IOException{
		User user = loginService.checkAccount(dto);
		System.out.println(user);
		
		
	}
}
