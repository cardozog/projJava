package br.com.guilherme.model;

public class Fornecedor {

	private Long id;
	private String nome;
	private String eMail;
	private String CNPJ;
	private String endereco;






	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	//onstrutores
	public Fornecedor() {

	}
	public Fornecedor(Long id, String nome, String eMail, String cNPJ, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.eMail = eMail;
		CNPJ = cNPJ;
		this.endereco = endereco;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", eMail=" + eMail + ", CNPJ=" + CNPJ + ", endereco="
				+ endereco + "]";
	}



}    