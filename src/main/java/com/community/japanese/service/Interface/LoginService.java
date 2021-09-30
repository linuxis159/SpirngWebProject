package com.community.japanese.service.Interface;

import java.io.IOException;

import com.community.japanese.dto.LoginDTO;
import com.community.japanese.vo.User;

public interface LoginService {
	User checkAccount(LoginDTO dto) throws IOException;

}
