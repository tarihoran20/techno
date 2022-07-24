package com.bootcamp.techno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kodehive/rumah_sakit")
public class PaseinController {
		
		@RequestMapping("/pasien")
		public String pasien() {
			return "/kodehive/rumah_sakit/pasien";
		

	}
}
