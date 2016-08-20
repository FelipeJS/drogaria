package br.com.grave.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ClientePessoaJuridica extends Pessoa {

	private static final long serialVersionUID = 326224520893933629L;

	@Column(length = 18)
	private String cnpj;

	@Column
	private String razaoSocial;

	@Column
	private String nomeFantasia;

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
