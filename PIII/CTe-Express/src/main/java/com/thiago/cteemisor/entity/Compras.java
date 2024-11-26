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
@Table(name = "compras")
public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento da primary key
	@Column(name = "codcompra")
	private Long id;
	
	@Column(name = "chavecompra")
	private String chaveCompra;
	
	@Column(name = "valorcompra")
	private BigDecimal valorCompra;
	
	@Column(name = "emitentecompra")
	private String emitenteCompra;
	
	@Column(name = "datacompra")
	private Date dataCompra;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChaveCompra() {
		return chaveCompra;
	}

	public void setChaveCompra(String chaveCompra) {
		this.chaveCompra = chaveCompra;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getEmitenteCompra() {
		return emitenteCompra;
	}

	public void setEmitenteCompra(String emitenteCompra) {
		this.emitenteCompra = emitenteCompra;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	
}
