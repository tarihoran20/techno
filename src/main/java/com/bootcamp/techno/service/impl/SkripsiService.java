package com.bootcamp.techno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.techno.repository.impl.SkripsiRepository;
import com.bootcamp.techno.service.ISkripsiService;
import com.bootcamp.techno.model.SkripsiModel;

@Service
public class SkripsiService implements ISkripsiService{
	
	@Autowired
	SkripsiRepository skripsiRepository;
	
	@Override
	public List<SkripsiModel> readAllData() {
		
		return skripsiRepository.readAllData();
	}
	
	@Override
	public List<SkripsiModel> readLessThanYear() {
		
		return skripsiRepository.readLessThanYear();
	}
	
	public List<SkripsiModel> atYearAndScore() {
		return skripsiRepository.atYearAndScore();

	}

//	@Override
//	public List<SkripsiModel> searchYear(int year) {
//		return skripsiRepository.searchYear(year);
//	}
	
	@Override
	public List<SkripsiModel> notMoreThanYear(int year) {
		return skripsiRepository.notMoreThanYear(year);
	}
	
	@Override
	public int deleteById(int id) {
		return skripsiRepository.deleteById(id);
	}

	@Override
	public int editById(SkripsiModel model, int id) {
		return skripsiRepository.editById(model, id);
	}

	@Override
	public List<SkripsiModel> searchWord(String word) {
		return skripsiRepository.searchWord(word);
	}

	@Override
	public List<SkripsiModel> yearAndScore(int year, double score) {
		return skripsiRepository.yearAndScore(year, score);
	}

	@Override
	public List<SkripsiModel> notYear(int year) {
		return skripsiRepository.notYear(year);
	}

	@Override
	public List<SkripsiModel> notStartLetter(char letter) {
		return skripsiRepository.notStartLetter(letter);
	}



}
