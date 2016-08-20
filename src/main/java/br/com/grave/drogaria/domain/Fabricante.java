package br.com.grave.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fabricante extends GerericDomain {

	private static final long serialVersionUID = -3175549771193269112L;

	@Column(nullable = false)
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
