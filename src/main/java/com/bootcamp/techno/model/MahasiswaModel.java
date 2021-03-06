package com.bootcamp.techno.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_MAHASISWA")

public class MahasiswaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int spp;
	private String alamat;
	private String email;
	private Date createdData;
	private String createdBy;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSpp() {
		return spp;
	}
	public void setSpp(int spp) {
		this.spp = spp;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public void setCreatedDate() {
		// TODO Auto-generated method stub
		
	}
	public void setCreatedBy(String currentUserFromLogin) {
		// TODO Auto-generated method stub
		
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
