package com.bootcamp.techno.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootcamp.techno.model.MahasiswaModel;
import com.bootcamp.techno.repository.IMahasiswaRepository;
import com.bootcamp.techno.service.IMahasiswaService;

public class MahasiswaService implements IMahasiswaService {
	@Autowired
	IMahasiswaRepository MahasiswaRepository;
	
	public void insert(MahasiswaModel model) {
		
		
		MahasiswaRepository.insert(model);

	}
	public void getCurrentUserFromLogin() {
		// TODO Auto-generated method stub

	}
	@Override
	public void Insert(MahasiswaModel mahasiswaModel) {
		// TODO Auto-generated method stub
		
	}

}
