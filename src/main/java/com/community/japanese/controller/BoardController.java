package com.community.japanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value="/board")
@Controller
public class BoardController {
	@RequestMapping(method = RequestMethod.GET, value="/list")
	String viewList(@RequestParam("boardId")String boardId) {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/post")
	String viewPost(@RequestParam("postId")String postId) {
		return null;
	}

}
