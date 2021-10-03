package com.community.japanese.dao.Implement;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.community.japanese.dao.Interface.BoardDAO;
import com.community.japanese.dto.PostListDTO;
import com.community.japanese.vo.Post;
@Repository
public class BoardDAOimpl implements BoardDAO{

	@Override
	public List<Post> selectPostList(PostListDTO dto) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try(SqlSession session = sqlSessionFactory.openSession(true)) {
			List<Post> postList = session.selectList("BoardMapper.selectPostList", dto);

			return postList;
		}
	}
	
	public int selectPostCount(int boardIdNum) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try(SqlSession session = sqlSessionFactory.openSession(true)) {
			int postCount = session.selectOne("BoardMapper.selectPostCount",boardIdNum);

			return postCount;
		
	}

	}
}
