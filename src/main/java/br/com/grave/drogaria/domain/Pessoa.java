package br.com.grave.drogaria.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa extends GerericDomain {

	private static final long serialVersionUID = -6721258656432749617L;

	@Column(nullable = false, length = 15)
	private String telefone;

	@Column(nullable = false, length = 15)
	private String celular;

	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private Calendar dataCadastro;

	@Column(nullable = false)
	private Boolean liberado;

	@Embedded
	private Endereco endereco;

	public String getTelefone() {
		return telefone;
	}

	public String getCelular() {
		return celular;
	}

	public String getEmail() {
		return email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public Boolean getLiberado() {
		return liberado;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setLiberado(Boolean liberado) {
		this.liberado = liberado;
	}

}
