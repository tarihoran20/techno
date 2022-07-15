package com.bootcamp.techno.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bootcamp.techno.model.MahasiswaModel;
import com.bootcamp.techno.repository.IMahasiswaRepository;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository{
	
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int insert(MahasiswaModel model) {
		var query = "Insert into t_mahasiswa(name, gender, alamat, spp)"
				+ "values (?, ?, ?, ?), new Object[]";
		
		return jdbc.update(query,
				new Object[] {model.getName(), model.getGender(), model.getAlamat(), model.getSpp()});
		
	}

	public List<MahasiswaModel> readAllData(){
		
		var query = "select * from t_mahasiswa";
		var result = jdbc.query(query, new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
		
		return result;
	}

}
