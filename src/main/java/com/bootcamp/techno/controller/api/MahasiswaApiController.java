package com.bootcamp.techno.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.techno.model.MahasiswaModel;
import com.bootcamp.techno.service.IMahasiswaService;

@RestController
@RequestMapping("/api")
public class MahasiswaApiController {

	@Autowired
	IMahasiswaService mahasiswaService;
	
	@PostMapping("/insert")
	public String InsertMahasiswa(@RequestBody MahasiswaModel mahasiswaModel) {
		mahasiswaService.Insert(mahasiswaModel);
		return "insert berhasil";
	}
	
}
