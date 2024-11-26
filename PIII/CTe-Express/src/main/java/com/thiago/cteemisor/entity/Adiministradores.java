package com.thiago.cteemisor.entity;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "adiministradores")
public class Adiministradores {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "codadmin")
	    private Long id;


	    @Column(name = "cpfadmin", nullable = false)
	    private String cpfAdmin;

	    @Column(name = "nomeadmin")
	    private String nome;

	    @Column(name = "loginadmin")
	    private String login;

	    @Column(name = "senhadmin")
	    private String senha;

	    @Column(name = "nascimento")
	    private Date nascimento;

	    @Column(name = "datacadadmin")
	    private Date dataCadAdmin;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCpfAdmin() {
			return cpfAdmin;
		}

		public void setCpfAdmin(String cpfAdmin) {
			this.cpfAdmin = cpfAdmin;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
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

		public Date getNascimento() {
			return nascimento;
		}

		public void setNascimento(Date nascimento) {
			this.nascimento = nascimento;
		}

		public Date getDataCadAdmin() {
			return dataCadAdmin;
		}

		public void setDataCadAdmin(Date dataCadAdmin) {
			this.dataCadAdmin = dataCadAdmin;
		}

	
}
