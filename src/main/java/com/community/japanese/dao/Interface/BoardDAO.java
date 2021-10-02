package com.community.japanese.dao.Interface;

import java.io.IOException;
import java.util.List;

import com.community.japanese.vo.Post;

public interface BoardDAO {
	List<Post> selectPostList(int boardIdNum) throws IOException;

}
