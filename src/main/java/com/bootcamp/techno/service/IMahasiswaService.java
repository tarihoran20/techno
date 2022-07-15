package com.bootcamp.techno.service;

import java.util.List;

import com.bootcamp.techno.model.MahasiswaModel;

public interface IMahasiswaService {

	int Insert(MahasiswaModel mahasiswaModel);

	public List<MahasiswaModel> readAllData();

}
