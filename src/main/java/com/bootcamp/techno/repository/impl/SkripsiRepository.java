package com.bootcamp.techno.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import com.bootcamp.techno.model.SkripsiModel;
import com.bootcamp.techno.repository.ISkripsiRepository;

public class SkripsiRepository implements ISkripsiRepository {
	
	JdbcTemplate jdbc;

	@Override
	public int show() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int show(SkripsiModel model) {
		// TODO Auto-generated method stub
		return 0 ;
	}
	

}
