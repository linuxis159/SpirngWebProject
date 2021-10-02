package com.community.japanese.service.Implement;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.japanese.dao.Interface.MainDAO;
import com.community.japanese.service.Interface.MainService;
import com.community.japanese.vo.Board;
@Service
public class JDBCMainService implements MainService{
	@Autowired
	MainDAO dao;
	
	@Override
	public List<Board> getBoardList() throws IOException {
		
		return dao.selectBoardList();
	}

}
