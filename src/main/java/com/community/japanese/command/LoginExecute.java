package com.community.japanese.command;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.community.japanese.dto.LoginDTO;
import com.community.japanese.service.Interface.LoginService;
import com.community.japanese.vo.User;

public class LoginExecute implements Execute{
	@Autowired
	LoginService loginService;
	
	public int execute(Object object) throws IOException {
		User user;
		LoginDTO dto = (LoginDTO)object;
		user = loginService.checkAccount(dto);
		return null;
		
	}

}
