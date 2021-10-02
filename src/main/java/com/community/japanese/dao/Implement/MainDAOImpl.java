package com.community.japanese.dao.Implement;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.community.japanese.dao.Interface.MainDAO;
import com.community.japanese.vo.Board;

@Repository
public class MainDAOImpl implements MainDAO{

	@Override
	public List<Board> selectBoardList() throws IOException {
		
		/*
		 * String resource = "mybatis-config.xml"; InputStream inputStream =
		 * Resources.getResourceAsStream(resource); SqlSessionFactory sqlSessionFactory
		 * = new SqlSessionFactoryBuilder().build(inputStream); try(SqlSession session =
		 * sqlSessionFactory.openSession(true)) { User user =
		 * session.selectOne("LoginMapper.selectAccount",dto); return user; }
		 */
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		try(SqlSession session = sqlSessionFactory.openSession(true)){
			List<Board> boardList = session.selectList("MainMapper.selectBoardList");
			return boardList;
		}
		
	}

}
