package com.bootcamp.techno.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootcamp.techno.service.IMahasiswaService;
import com.bootcamp.techno.service.ISkripsiService;
import com.bootcamp.techno.service.impl.MahasiswaService;
import com.bootcamp.techno.model.MahasiswaModel;

@Controller
public class MahasiswaController {
	@Autowired
	IMahasiswaService mahasiswaService;

	@RequestMapping()
	public String view() {
		return "/home";
	}

//	@RequestMapping("kodehive/mahasiswa")
//	public String view2() {
//		return "/kodehive/kampus/kelas/mahasiswa";
//	}

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
	
	@RequestMapping("kodehive/learn_css")
	public String learnCss() {
		return "/learn_css";
	}
	
	@RequestMapping("kodehive/registration")
	public String registration() {
		return "/registration";
	}
	
	@RequestMapping("kodehive/registration2")
	public String registration2() {
		return "/registration2";
	}
	
	@RequestMapping("kodehive/learn_jquery")
	public String learnJquery() {
		return "/learn_jquery";
	}
	
	@RequestMapping("kodehive/jqueryQuiz1No5")
	public String quiz1No5() {
		return "/kodehive/jqueryQuiz1No5";
	}
	
	@RequestMapping("kodehive/jqueryQuiz1No6")
	public String quiz1No6() {
		return "/kodehive/jqueryQuiz1No6";
	}
	
//	@RequestMapping("kodehive/mahasiswa")
//	public String mahasiswa() {
//		return "/kodehive/mahasiswa";
//	}
	
	@RequestMapping("kodehive/mahasiswa/list")
	public String mahasiswaList(Model model) {
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = mahasiswaService.readAllData();
		//System.out.println(mahasiswaModelList);
		
		model.addAttribute("mahasiswa", mahasiswaModelList);
		return "mahasiswa/list";
	}
	
	@RequestMapping("kodehive/mahasiswa/add")
	public String mahasiswaAddModal() {
		
		return "/mahasiswa/add";
	}
	
	@RequestMapping("kodehive/mahasiswa/create")
	public String mahasiswaCreate(@RequestBody MahasiswaModel model) {
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel.setName(model.getName());
		mahasiswaModel.setGender(model.getGender());
		mahasiswaModel.setSpp(model.getSpp());
		mahasiswaModel.setAlamat(model.getAlamat());
		
		mahasiswaService.Insert(mahasiswaModel);
		
		return "/mahasiswa/home";
	}
	
}
