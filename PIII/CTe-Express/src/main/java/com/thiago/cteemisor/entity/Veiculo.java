package com.thiago.cteemisor.entity;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "veiculos")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codveiculo")
	private Long id;
	
	@Column(name = "placaveic")
	private String placa;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "anofab")
	private Date anoFab;
	
	@Column(name = "dataqui")
	private Date datAqui;
	
	@Column(name = "kmcorrido")
	private BigDecimal kmCorrido;
	
	@Column(name = "chassi")
	private String chassi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(Date anoFab) {
		this.anoFab = anoFab;
	}

	public Date getDatAqui() {
		return datAqui;
	}

	public void setDatAqui(Date datAqui) {
		this.datAqui = datAqui;
	}

	public BigDecimal getKmCorrido() {
		return kmCorrido;
	}

	public void setKmCorrido(BigDecimal kmCorrido) {
		this.kmCorrido = kmCorrido;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	
}
