package com.community.japanese.dao.Interface;

import java.io.IOException;
import java.util.List;

import com.community.japanese.dto.PostListDTO;
import com.community.japanese.vo.Post;

public interface BoardDAO {
	List<Post> selectPostList(PostListDTO dto) throws IOException;
	
	int selectPostCount(int boardIdNum) throws IOException;

}
