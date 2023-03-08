package br.com.dio;

import br.com.dio.model.Animal;
import br.com.dio.model.Pessoa;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Pedro Henrique", "8");
		System.out.println(pessoa);
		
		Animal animal = new Animal("Cachorro", "Caco");
		System.out.println(animal);
	}
}
