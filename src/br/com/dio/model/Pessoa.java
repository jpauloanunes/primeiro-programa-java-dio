package br.com.dio.model;

import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private String idade;
	
	public Pessoa () {}

	public Pessoa (String nome, String idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", idade = " + idade + " anos]";
	}
	
}
