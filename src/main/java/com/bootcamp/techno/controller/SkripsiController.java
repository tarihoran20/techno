package com.bootcamp.techno.controller;

import java.util.List;

import org.hibernate.annotations.SQLUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.techno.model.SkripsiModel;
import com.bootcamp.techno.service.ISkripsiService;

@RestController
public class SkripsiController {
	@Autowired
	ISkripsiService skripsiService;
	
	@RequestMapping("/kodehive/kampus")
	//@ResponseBody
	public List<SkripsiModel> readAllData() {
		
		return skripsiService.readAllData();
	}
	
//	@RequestMapping("/kodehive/kampus/1")
//	//@ResponseBody
//	public List<SkripsiModel> readLessThanYear() {
//		
//		return skripsiService.readLessThanYear();
//	}
	
//	@RequestMapping("/kodehive/kampus/2/{year}")
//	//@ResponseBody
//	public List<SkripsiModel> searchYear(@PathVariable int year) {
//		
//		return skripsiService.searchYear(year);
//	}
	
	@RequestMapping("/kodehive/kampus/search1")
	//@ResponseBody
	public List<SkripsiModel> notMoreThanYear(@RequestParam int year) {
		
		return skripsiService.notMoreThanYear(year);
	}
	
	@RequestMapping("/kodehive/kampus/search2")
	//@ResponseBody
	public List<SkripsiModel> searchWord(@RequestParam String word) {
		
		return skripsiService.searchWord(word);
	}
	
	@RequestMapping("/kodehive/kampus/search3")
	//@ResponseBody
	public List<SkripsiModel> yearAndScore(@RequestParam int year, @RequestParam double score) {
		
		return skripsiService.yearAndScore(year, score);
	}
	
	@RequestMapping("/kodehive/kampus/search4")
	//@ResponseBody
	public List<SkripsiModel> notYear(@RequestParam int year) {
		
		return skripsiService.notYear(year);
	}
	
	@RequestMapping("/kodehive/kampus/search5")
	//@ResponseBody
	public List<SkripsiModel> notYear(@RequestParam char letter) {
		
		return skripsiService.notStartLetter(letter);
	}
	
	@DeleteMapping("/kodehive/kampus/delete")
	//@ResponseBody
	//public String deleteById(@PathVariable int id) {
	public String deleteById(@RequestParam int id){
		
		return "Deleted Done "+skripsiService.deleteById(id);
	}
	
	@PutMapping("/kodehive/kampus/edit")
	public String editById(SkripsiModel model, @RequestParam int id) {
		
		return "Updated " + skripsiService.editById(model, id);
	}
	
	
	
}
