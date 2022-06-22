package com.br.pdv.app.model;

public class Funcionario extends Pessoa {
	private Integer id;

	public Funcionario(String nome, String cpf, String dataDeNascimento, char sexo, String endereco) {
		super(nome, cpf, dataDeNascimento, sexo, endereco);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Funcionario:\n"
				+ "[nome = " + this.getNome() +
				", cpf = " + this.getCpf() + 
				", dataDeNascimento = " + this.getDataDeNascimento() +
				", sexo = " + this.getSexo() + 
				", endereco = " + this.getEndereco() + "]";
	}
}
