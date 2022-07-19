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
	
	@RequestMapping("kodehive/mahasiswa/skripsi")
	public String viewSkripsi() {
		return "/kodehive/kampus/skripsi";
	}
	
	@RequestMapping("kodehive/learn")
	public String learn() {
		return "/learn";
	}
	
	@RequestMapping("kodehive/learn_js")
	public String learnJs() {
		return "/learn_js";
	}
}


