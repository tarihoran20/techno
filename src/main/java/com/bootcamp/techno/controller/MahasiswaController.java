package com.bootcamp.techno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MahasiswaController{
	
	@RequestMapping()
	public String view() {
		return "/home";
	}
	
	@RequestMapping("kodehive/mahasiswa")
	public String view2() {
		return "/kodehive/kampus/kelas/mahasiswa";
	}
}


