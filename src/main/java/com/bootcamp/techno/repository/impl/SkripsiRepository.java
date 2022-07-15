package com.bootcamp.techno.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bootcamp.techno.model.MahasiswaModel;
import com.bootcamp.techno.model.SkripsiModel;
import com.bootcamp.techno.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository {
	
	@Autowired
	JdbcTemplate jdbc;

	
	public List<SkripsiModel> readAllData(){
		
		var query = "select * from t_skripsi";
		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}


	@Override
	public List<SkripsiModel> readLessThanYear() {
		
		var query = "select * from t_skripsi where tahun < 2013";
		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}
	
	@Override
	public List<SkripsiModel> atYearAndScore() {
		
		var query = "select * from t_skripsi where tahun = 2010 and nilai > 3";
		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}


	@Override
	public List<SkripsiModel> searchYear(int year) {
		var query = "select * from t_skripsi where tahun like '%"+year+"%' ";
		return jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}


	@Override
	public int deleteById(int id) {
		var query = "delete from t_skripsi where id = ? ";
		return jdbc.update(query, id);
	}


	@Override
	public int editById(SkripsiModel model, int id) {
		var query = "update t_skripsi set judul=?, nilai=?, tahun=? where id=?";
		return jdbc.update(query, new Object[] {model.getJudul(), model.getNilai(), model.getTahun(), id});
	}

//	@Override
//	public int insert(SkripsiModel model) {
//		var query = "Insert into t_skripsi(judul, nilai, tahun)"
//				+ "values (?, ?, ?), new Object[]";
//		
//		return jdbc.update(query,
//				new Object[] {model.getName(), model.getGender(), model.getAlamat(), model.getSpp()});
//		
//	}
	
	
	

}
