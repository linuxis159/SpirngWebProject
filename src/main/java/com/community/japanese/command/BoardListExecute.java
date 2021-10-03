package com.community.japanese.command;

import java.io.IOException;
import java.util.List;

import org.springframework.ui.Model;

import com.community.japanese.vo.Post;

public class BoardListExecute implements Execute{

	@Override
	public void execute(Model model) throws IOException {
		int boardIdNum = Integer.valueOf((String)model.getAttribute("boardId"));
		List<Post> postList = boardService.getPostList(boardIdNum);
		System.out.println(postList);
		model.addAttribute("postList", postList);
	}
	
	
	

}
