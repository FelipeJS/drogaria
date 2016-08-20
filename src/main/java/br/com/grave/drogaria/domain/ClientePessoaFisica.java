package br.com.grave.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ClientePessoaFisica extends Pessoa {

	private static final long serialVersionUID = 847572913858145528L;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String cpf;

	@Column(nullable = false)
	private String rg;

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
