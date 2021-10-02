package com.community.japanese.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.community.japanese.dto.LoginDTO;
import com.community.japanese.service.Interface.LoginService;
import com.community.japanese.validator.LoginDTOValidator;
import com.community.japanese.vo.User;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/formPage")
	String loginPage() {
		return "root.login.loginForm";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "/process")
	int loginProcess(@RequestBody @Validated LoginDTO dto, BindingResult result)
			throws IOException, NullPointerException {
		
		if (result.hasErrors()) {
			return 0;
		}

		User user = loginService.checkAccount(dto);

		if (user == null) {
			System.out.println("NULL");
			return 1;
		}

		return 2;

	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new LoginDTOValidator());
	}

}
