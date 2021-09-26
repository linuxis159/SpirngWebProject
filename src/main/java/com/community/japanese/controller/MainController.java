package com.community.japanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class MainController {
	
		@RequestMapping("main")
		String main() {
			return "root.main";
		}

	}
	

