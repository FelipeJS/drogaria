package br.com.grave.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Estado extends GerericDomain {

	private static final long serialVersionUID = -7062156848506615952L;

	@Column(length = 2, nullable = false)
	private String sigla;

	@Column(length = 50, nullable = false)
	private String nome;

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
