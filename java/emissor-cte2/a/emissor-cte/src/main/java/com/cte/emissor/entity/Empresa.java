package com.cte.emissor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa") //Tabela empresa para testar adição de dados nela atrasvez do codigo java
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento da primary key
	@Column(name = "codempresa")
	private Long id;
	
	@Column(name = "cnpj", unique = true)
	private String cnpj;
	
	@Column(name = "nomefantasia")
	private String nomeFantasia;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "endempresa")
	private String endEmpresa;
	
	@Column(name = "abertura")
	private Date abertura;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "razsocial")
	private String razSocial;
	
	@Column(name = "ie")
	private String ie;
	
	@Column(name = "tiptransporte")
	private String tipTransporte;
	
	@Column(name = "senhaempresa")
	private String senhaEmpresa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndEmpresa() {
		return endEmpresa;
	}

	public void setEndEmpresa(String endEmpresa) {
		this.endEmpresa = endEmpresa;
	}

	public Date getAbertura() {
		return abertura;
	}

	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRazSocial() {
		return razSocial;
	}

	public void setRazSocial(String razSocial) {
		this.razSocial = razSocial;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getTipTransporte() {
		return tipTransporte;
	}

	public void setTipTransporte(String tipTransporte) {
		this.tipTransporte = tipTransporte;
	}

	public String getSenhaEmpresa() {
		return senhaEmpresa;
	}

	public void setSenhaEmpresa(String senhaEmpresa) {
		this.senhaEmpresa = senhaEmpresa;
	}
}
