package com.bootcamp.techno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/kodehive/page")
public class BerandaController {
	
	@RequestMapping("/beranda")
	public String beranda() {
		String html = "kodehive/page/beranda/beranda2";
		return html;
	}

}
