package com.bootcamp.techno.repository;

import java.util.List;

import com.bootcamp.techno.model.MahasiswaModel;
import com.bootcamp.techno.model.SkripsiModel;

public interface IMahasiswaRepository {


	public int insert(MahasiswaModel model);

	public List<MahasiswaModel> readAllData();

}
