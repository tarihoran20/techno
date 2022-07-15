package com.bootcamp.techno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootcamp.techno.model.MahasiswaModel;
import com.bootcamp.techno.model.SkripsiModel;
import com.bootcamp.techno.repository.impl.SkripsiRepository;

public interface ISkripsiService{
	
	
	public List<SkripsiModel> readAllData();
	public List<SkripsiModel> readLessThanYear();
	public List<SkripsiModel> searchYear(int year);
	public int deleteById(int id);
	public int editById(SkripsiModel model, int id);

}
