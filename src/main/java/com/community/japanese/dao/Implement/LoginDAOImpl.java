package com.community.japanese.dao.Implement;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import com.community.japanese.dao.Interface.LoginDAO;
import com.community.japanese.dto.LoginDTO;
import com.community.japanese.vo.User;
@Component
public class LoginDAOImpl implements LoginDAO{

	@Override
	public User selectAccount(LoginDTO dto) throws IOException {
		

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try(SqlSession session = sqlSessionFactory.openSession(true)) {
			User user = session.selectOne("LoginMapper.selectAccount",dto);
			return user;
		}
		
	}

}
