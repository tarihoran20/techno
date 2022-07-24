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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNomorPasien() {
		return nomorPasien;
	}
	public void setNomorPasien(int nomorPasien) {
		this.nomorPasien = nomorPasien;
	}
	public String getNamaPasien() {
		return namaPasien;
	}
	public void setNamaPasien(String namaPasien) {
		this.namaPasien = namaPasien;
	}
	public String getGenderPasien() {
		return genderPasien;
	}
	public void setGenderPasien(String genderPasien) {
		this.genderPasien = genderPasien;
	}
	public String getKategoriPasien() {
		return kategoriPasien;
	}
	public void setKategoriPasien(String kategoriPasien) {
		this.kategoriPasien = kategoriPasien;
	}
	public int getBiayaPasien() {
		return biayaPasien;
	}
	public void setBiayaPasien(int biayaPasien) {
		this.biayaPasien = biayaPasien;
	}
	public String getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	

}
