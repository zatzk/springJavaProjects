package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	private int aid;
	private String atelPessoal;
	private String atelComercial;
	private String atelOutro;
	private String aemail;
	private String anome;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAtelPessoal() {
		return atelPessoal;
	}
	public void setAtelPessoal(String atelPessoal) {
		this.atelPessoal = atelPessoal;
	}
	public String getAtelComercial() {
		return atelComercial;
	}
	public void setAtelComercial(String atelComercial) {
		this.atelComercial = atelComercial;
	}
	public String getAtelOutro() {
		return atelOutro;
	}
	public void setAtelOutro(String atelOutro) {
		this.atelOutro = atelOutro;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getAnome() {
		return anome;
	}
	public void setAnome(String anome) {
		this.anome = anome;
	}
	@Override
	public String toString() {
		return "Agenda [aid=" + aid + ", atelPessoal=" + atelPessoal + ", atelComercial=" + atelComercial
				+ ", atelOutro=" + atelOutro + ", aemail=" + aemail + ", anome=" + anome + "]";
	}
	
	
}
