package Desafio4;

public class Pessoa {
	
	//Foi mudado de public para private
	private String nome;
	private int idade;
	
	//Foi adicionado o construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}	
}
