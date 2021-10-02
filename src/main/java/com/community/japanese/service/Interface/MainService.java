package com.community.japanese.service.Interface;

import java.io.IOException;
import java.util.List;

import com.community.japanese.vo.Board;

public interface MainService {
	List<Board> getBoardList() throws IOException;

}
