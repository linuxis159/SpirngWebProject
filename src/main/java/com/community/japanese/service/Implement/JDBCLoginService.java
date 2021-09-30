package com.community.japanese.service.Implement;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.japanese.dao.Interface.LoginDAO;
import com.community.japanese.dto.LoginDTO;
import com.community.japanese.service.Interface.LoginService;
import com.community.japanese.vo.User;
@Service
public class JDBCLoginService implements LoginService{
	@Autowired
	LoginDAO dao;
	
	@Override
	public User checkAccount(LoginDTO dto) throws IOException {
		return dao.selectAccount(dto);
	}

}
