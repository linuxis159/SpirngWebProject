package com.community.japanese.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.community.japanese.service.Interface.BoardService;
import com.community.japanese.vo.Post;

@RequestMapping(value="/board")
@Controller
public class BoardController {
	@Autowired
	BoardService boardService; 
	
	@SuppressWarnings("null")
	@RequestMapping(method = RequestMethod.GET, value="/list")
	String viewList(Model model, String boardId) throws IOException {
		int boardIdNum = Integer.valueOf(boardId);
		List<Post> postList = boardService.getPostList(boardIdNum);
		System.out.println(postList);
		model.addAttribute("postList", postList);
		return "root.board.list";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/post")
	String viewPost(@RequestParam("postId")String postId) {
		return null;
	}

}
