package com.cte.emissor.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "cte")
public class Cte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="codcte")
	private Long id;
	
	@Column(name = "cfop")
	private String cfop;
	
	@Column(name = "tiposerv")
	private String tipoServ;
	
	@Column(name = "formaemissao")
	private String formaEmissao;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "finalidade")
	private String finalidade;
	
	@Column(name = "serie")
	private Integer serie;
	
	@Column(name = "numero")
	private Integer numero;
	
	@Column(name = "modelo")
	private Integer modelo;
	
	@Column(name = "formapagamento")
	private String formaPag;
	
	@Column(name = "chavenfe")
	private String chaveNfe;
	
	@Column(name = "emissaouf")
	private String emissaoUf;
	
	@Column(name = "emissaomuni")
	private String emissaoMuni;
	
	@Column(name = "iniciouf")
	private String inicioUf;
	
	@Column(name = "iniciomuni")
	private String inicioMuni;
	
	@Column(name = "finaluf")
	private String finalUf;
	
	@Column(name = "finalmuni")
	private String finalMuni;
	
	@Column(name = "prodpredo")
	private String prodPredo;
	
	@Column(name = "valorcarga")
	private BigDecimal valorCarga;
	
	@Column(name = "pesocarga")
	private BigDecimal pesoCarga;
	
	@Column(name = "tipopeso")
	private String tipoPeso;
	
	@Column(name = "quantproduto")
	private BigDecimal quantProd;
	
	@Column(name = "classtribut")
	private String classTribut;
	
	@Column(name = "icms")
	private BigDecimal icms;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public String getTipoServ() {
		return tipoServ;
	}

	public void setTipoServ(String tipoServ) {
		this.tipoServ = tipoServ;
	}

	public String getFormaEmissao() {
		return formaEmissao;
	}

	public void setFormaEmissao(String formaEmissao) {
		this.formaEmissao = formaEmissao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public String getChaveNfe() {
		return chaveNfe;
	}

	public void setChaveNfe(String chaveNfe) {
		this.chaveNfe = chaveNfe;
	}

	public String getEmissaoUf() {
		return emissaoUf;
	}

	public void setEmissaoUf(String emissaoUf) {
		this.emissaoUf = emissaoUf;
	}

	public String getEmissaoMuni() {
		return emissaoMuni;
	}

	public void setEmissaoMuni(String emissaoMuni) {
		this.emissaoMuni = emissaoMuni;
	}

	public String getInicioUf() {
		return inicioUf;
	}

	public void setInicioUf(String inicioUf) {
		this.inicioUf = inicioUf;
	}

	public String getInicioMuni() {
		return inicioMuni;
	}

	public void setInicioMuni(String inicioMuni) {
		this.inicioMuni = inicioMuni;
	}

	public String getFinalUf() {
		return finalUf;
	}

	public void setFinalUf(String finalUf) {
		this.finalUf = finalUf;
	}

	public String getFinalMuni() {
		return finalMuni;
	}

	public void setFinalMuni(String finalMuni) {
		this.finalMuni = finalMuni;
	}

	public String getProdPredo() {
		return prodPredo;
	}

	public void setProdPredo(String prodPredo) {
		this.prodPredo = prodPredo;
	}

	public BigDecimal getValorCarga() {
		return valorCarga;
	}

	public void setValorCarga(BigDecimal valorCarga) {
		this.valorCarga = valorCarga;
	}

	public BigDecimal getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(BigDecimal pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	public String getTipoPeso() {
		return tipoPeso;
	}

	public void setTipoPeso(String tipoPeso) {
		this.tipoPeso = tipoPeso;
	}

	public BigDecimal getQuantProd() {
		return quantProd;
	}

	public void setQuantProd(BigDecimal quantProd) {
		this.quantProd = quantProd;
	}

	public String getClassTribut() {
		return classTribut;
	}

	public void setClassTribut(String classTribut) {
		this.classTribut = classTribut;
	}

	public BigDecimal getIcms() {
		return icms;
	}

	public void setIcms(BigDecimal icms) {
		this.icms = icms;
	}
	
	
}
