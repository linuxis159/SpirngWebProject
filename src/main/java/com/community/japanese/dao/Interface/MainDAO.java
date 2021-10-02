package com.community.japanese.dao.Interface;

import java.io.IOException;
import java.util.List;

import com.community.japanese.vo.Board;

public interface MainDAO {
	List<Board> selectBoardList() throws IOException;

}
