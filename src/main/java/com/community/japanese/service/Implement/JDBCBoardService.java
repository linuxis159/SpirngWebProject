package com.community.japanese.service.Implement;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.japanese.dao.Interface.BoardDAO;
import com.community.japanese.dto.PostListDTO;
import com.community.japanese.service.Interface.BoardService;
import com.community.japanese.vo.Post;
@Service
public class JDBCBoardService implements BoardService{
	@Autowired
	BoardDAO dao;
	
	@Override
	public List<Post> getPostList(PostListDTO dto) throws IOException {
		
		return dao.selectPostList(dto);
	}
	
	public int getPostCount(int boardId) throws IOException {
		
		return dao.selectPostCount(boardId);
	}
	

}
