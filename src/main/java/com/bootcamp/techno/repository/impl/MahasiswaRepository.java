package com.bootcamp.techno.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bootcamp.techno.model.MahasiswaModel;
import com.bootcamp.techno.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository{
	
	JdbcTemplate jdbc;

	@Override
	public int insert(MahasiswaModel model) {
		var query = "Insert into t_mahasiswa(name, gender, alamat, spp)"
				+ "values (?, ?, ?, ?), new Object[]";
		
		return jdbc.update(query, new Object[] {model.getName(), model.getGender(), model.getAlamat(), model.getSpp()});
		
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

}
