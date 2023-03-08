package br.com.dio.model;

import java.util.Objects;

public class Animal {
	
	private String tipo;
	private String nome;
	
	public Animal() {}

	public Animal(String tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "Animal [tipo = " + tipo + ", nome = " + nome + "]";
	}
	
}
