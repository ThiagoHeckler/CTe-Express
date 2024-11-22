package com.thiago.cteemisor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "motorista")
public class Motorista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento da primary key
	@Column(name = "codmotorista")
	private Long id;
	
	@Column(name = "cpfmotorista")
	private String cpf;
	
	@Column(name = "cnh")
	private String cnh;
	
	@Column(name = "nomemotorista")
	private String nome;
	
	@Column(name = "datacadmotorista")
	private Date dataCadMotorista ;
	
	@Column(name = "datanasmotorista")
	private Date dataNasMotorista ;
	
	@Column(name = "loginmotorista")
	private String login;
	
	@Column(name = "senhamotorista")
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCadMotorista() {
		return dataCadMotorista;
	}

	public void setDataCadMotorista(Date dataCadMotorista) {
		this.dataCadMotorista = dataCadMotorista;
	}

	public Date getDataNasMotorista() {
		return dataNasMotorista;
	}

	public void setDataNasMotorista(Date dataNasMotorista) {
		this.dataNasMotorista = dataNasMotorista;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
