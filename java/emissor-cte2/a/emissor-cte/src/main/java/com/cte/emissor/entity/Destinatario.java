package com.cte.emissor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "destinatario")
public class Destinatario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="coddest")
	private Long id;
	
	@Column(name ="nomedest")
	private String nome;
	
	@Column(name ="enddest")
	private String endreco;
	
	@Column(name ="munidest")
	private String municipio;
	
	@Column(name ="cpfdest", nullable = true)
	private String cpf;
	
	@Column(name ="cnpjdest", nullable = true)
	private String cnpj;
	
	@Column(name ="pedest")
	private String pereme;
	
	@Column(name ="iedest", nullable = true)
	private Integer ie;
	
	@Column(name ="cepdest")
	private String cep;
	
	@Column(name ="fonedest", nullable = true)
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
