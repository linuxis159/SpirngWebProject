package com.community.japanese.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.community.japanese.service.Interface.MainService;
import com.community.japanese.vo.Board;

@RequestMapping("/")
@Controller
public class MainController {
		@Autowired
		MainService mainService;
	
		@RequestMapping(value="main", method = RequestMethod.GET) 
		String main(Model model) throws IOException {
			List<Board> boardList = mainService.getBoardList();
			model.addAttribute("boardList", boardList);
			return "root.main";
		}
		


	}
	

