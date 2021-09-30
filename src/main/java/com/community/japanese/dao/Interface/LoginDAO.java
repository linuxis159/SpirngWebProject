package com.community.japanese.dao.Interface;

import java.io.IOException;

import com.community.japanese.dto.LoginDTO;
import com.community.japanese.vo.User;

public interface LoginDAO {
	User selectAccount(LoginDTO dto) throws IOException;

}
