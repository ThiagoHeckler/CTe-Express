package com.thiago.cteemisor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tomador")
public class Tomador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="codtomador")
	private Long id;
	
	@Column(name ="nometomador")
	private String nome;
	
	@Column(name ="endtomador")
	private String endreco;
	
	@Column(name ="cpftomador", nullable = true)
	private String cpf;
	
	@Column(name ="cnpjtomador", nullable = true)
	private String cnpj;
	
	@Column(name ="ietomador", nullable = true)
	private Integer ie;
	
	@Column(name ="munitomador")
	private String municipio;
	
	@Column(name ="fonetomador", nullable = true)
	private String foneReme;
	
	@Column(name ="petomador")
	private String pereme;
	
	@Column(name ="ceptomador")
	private String cep;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndreco() {
		return endreco;
	}

	public void setEndreco(String endreco) {
		this.endreco = endreco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getIe() {
		return ie;
	}

	public void setIe(Integer ie) {
		this.ie = ie;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getFoneReme() {
		return foneReme;
	}

	public void setFoneReme(String foneReme) {
		this.foneReme = foneReme;
	}

	public String getPereme() {
		return pereme;
	}

	public void setPereme(String pereme) {
		this.pereme = pereme;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
