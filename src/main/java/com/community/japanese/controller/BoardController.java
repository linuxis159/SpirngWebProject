package com.community.japanese.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.community.japanese.dto.PagingDTO;
import com.community.japanese.dto.PostListDTO;
import com.community.japanese.service.Interface.BoardService;
import com.community.japanese.vo.Post;

@RequestMapping(value="/board")
@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService; 
	
	@SuppressWarnings("null")
	@RequestMapping(method = RequestMethod.GET, value="/list")
	String viewList(Model model, String boardId, String page, 
			@RequestParam(defaultValue="1")String sort) throws IOException {
		int sortNum = Integer.valueOf(sort);
		int boardIdNum = Integer.valueOf(boardId);
		int pageNum = Integer.valueOf(page);
		int range = 5;
		
		PostListDTO dto = new PostListDTO(boardIdNum, pageNum, range);
		List<Post> postList = boardService.getPostList(dto);
		int postCount = boardService.getPostCount(boardIdNum);
		
		
		PagingDTO pDto = new PagingDTO(boardIdNum, pageNum, sortNum, 5, (postCount/range)+1);
		model.addAttribute(postList);
		model.addAttribute("pDto", pDto);
		return "root.board.list";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/post")
	String viewPost(@RequestParam("postId")String postId) {
		return null;
	}
	

}
