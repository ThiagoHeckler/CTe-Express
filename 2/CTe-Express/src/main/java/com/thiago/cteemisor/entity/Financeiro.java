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
@Table(name = "Financeiro")
public class Financeiro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codfinanceiro")
	private Long id;
	
	@Column(name = "contafinanceiro")
	private String contaFinanceiro;
	
	@Column(name = "datafinanceiro")
	private Date dataFinanceiro;
	
	@Column(name = "valorfinanceiro")
	private BigDecimal valorFinanceiro;

	@Column(name = "descricaofinanceiro")
	private String descricaoFinanceiro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContaFinanceiro() {
		return contaFinanceiro;
	}

	public void setContaFinanceiro(String contaFinanceiro) {
		this.contaFinanceiro = contaFinanceiro;
	}

	public Date getDataFinanceiro() {
		return dataFinanceiro;
	}

	public void setDataFinanceiro(Date dataFinanceiro) {
		this.dataFinanceiro = dataFinanceiro;
	}

	public BigDecimal getValorFinanceiro() {
		return valorFinanceiro;
	}

	public void setValorFinanceiro(BigDecimal valorFinanceiro) {
		this.valorFinanceiro = valorFinanceiro;
	}

	public String getDescricaoFinanceiro() {
		return descricaoFinanceiro;
	}

	public void setDescricaoFinanceiro(String descricaoFinanceiro) {
		this.descricaoFinanceiro = descricaoFinanceiro;
	}
}

