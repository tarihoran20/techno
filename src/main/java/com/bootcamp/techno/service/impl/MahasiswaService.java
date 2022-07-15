package com.bootcamp.techno.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.techno.model.EmailModel;
import com.bootcamp.techno.model.MahasiswaModel;
import com.bootcamp.techno.repository.IMahasiswaRepository;
import com.bootcamp.techno.service.IMahasiswaService;

@Service
public class MahasiswaService implements IMahasiswaService {
	
	@Autowired
	IMahasiswaRepository mahasiswaRepository;
	
	public int Insert(MahasiswaModel model) {
		
		model.setCreatedBy(getCurrentUserFromLogin());
		var result = mahasiswaRepository.insert(model);
		
		var emailModel = new EmailModel();
		var to = new ArrayList<String>();
		to.add(model.getEmail());
		emailModel.setMessage("Anda telah terdaftar pada tahun ajaran xxx");
		emailModel.setTo(to);
		emailModel.setSubject("Penerimaan Mahasiswa Baru");
		
		return result;

	}
	public String getCurrentUserFromLogin() {
		
		
		return " from: method get current from login";

	}
	
	@Override
	public List<MahasiswaModel> readAllData() {
		
		var result = mahasiswaRepository.readAllData();
		System.out.println("select success");
		return result;
	}

}
