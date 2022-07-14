package com.bootcamp.techno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KaryawanController {
	
	@RequestMapping("/kodehive/karyawan")
	public String view() {
		
		return "kodehive/company/divisi/karyawan";
	}

}
