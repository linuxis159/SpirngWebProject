package com.community.japanese.service.Interface;

import java.io.IOException;
import java.util.List;

import com.community.japanese.vo.Post;

public interface BoardService {
	List<Post> getPostList(int boardIdNum) throws IOException;

}
