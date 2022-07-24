package com.bootcamp.techno.repository;

import java.util.List;

import com.bootcamp.techno.model.SkripsiModel;

public interface ISkripsiRepository {
	
	//public int show();
	
	//int show(SkripsiModel model);
	public List<SkripsiModel> readAllData();
	
	public List<SkripsiModel> readLessThanYear();

	public List<SkripsiModel> atYearAndScore();

	public int deleteById(int id);
	
	public int editById(SkripsiModel model, int id);

	List<SkripsiModel> notMoreThanYear(int year);

	List<SkripsiModel> searchWord(String word);
	
	List<SkripsiModel> yearAndScore(int year, double score);
	
	List<SkripsiModel> notYear(int year);
	
	List<SkripsiModel> notStartLetter(char letter);
	
	

}
