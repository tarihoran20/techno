package com.bootcamp.techno.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_PASIEN")
public class PasienModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int nomorPasien;
	private String namaPasien;
	private String genderPasien;
	private String kategoriPasien;
	private int biayaPasien;
	private String tanggalLahir;

}
