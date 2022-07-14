package com.bootcamp.techno.repository;

import com.bootcamp.techno.model.MahasiswaModel;

public interface IMahasiswaRepository {
	
	public int insert();

	int insert(MahasiswaModel model);

}
