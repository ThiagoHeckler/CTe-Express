package com.thiago.cteemisor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "remetente")
public class Remetente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="codreme")
	private Long id;
	
	@Column(name ="nomereme")
	private String nome;
	
	@Column(name ="endreme")
	private String endreco;
	
	@Column(name ="munireme")
	private String municipio;
	
	@Column(name ="cpfreme", nullable = true)
	private String cpf;
	
	@Column(name ="cnpjreme", nullable = true)
	private String cnpj;
	
	@Column(name ="pereme")
	private String pereme;
	
	@Column(name ="iereme", nullable = true)
	private Integer ie;
	
	@Column(name ="cepreme")
	private String cep;
	
	@Column(name ="fonereme", nullable = true)
	private String foneReme;

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

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
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

	public String getPereme() {
		return pereme;
	}

	public void setPereme(String pereme) {
		this.pereme = pereme;
	}

	public Integer getIe() {
		return ie;
	}

	public void setIe(Integer ie) {
		this.ie = ie;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getFoneReme() {
		return foneReme;
	}

	public void setFoneReme(String foneReme) {
		this.foneReme = foneReme;
	}
	
}

