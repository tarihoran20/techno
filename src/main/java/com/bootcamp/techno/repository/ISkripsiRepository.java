package com.bootcamp.techno.repository;

import java.util.List;

import com.bootcamp.techno.model.SkripsiModel;

public interface ISkripsiRepository {
	
	//public int show();
	
	//int show(SkripsiModel model);
	public List<SkripsiModel> readAllData();
	
	public List<SkripsiModel> readLessThanYear();

	public List<SkripsiModel> atYearAndScore();
	
	public List<SkripsiModel> searchYear(int year);

	public int deleteById(int id);
	
	public int editById(SkripsiModel model, int id);
	
	

}
