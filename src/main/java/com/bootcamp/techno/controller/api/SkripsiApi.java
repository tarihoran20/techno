package com.bootcamp.techno.controller.api;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.techno.model.SkripsiModel;
import com.bootcamp.techno.service.impl.SkripsiService;


public class SkripsiApi {
	SkripsiService skripsiService;
	JdbcTemplate jdbc;
	
	@GetMapping("/kodehive/2/{year}")
	public List<SkripsiModel> searchYear(int year) {
		var query = "select * from t_skripsi where tahun like '%"+year+"%' ";
		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}
	
	@DeleteMapping("/kodehive/delete")
	public String delete(@RequestParam int id) {
		return "sukses delete" + skripsiService.deleteById(id);

	}
	
	
}
