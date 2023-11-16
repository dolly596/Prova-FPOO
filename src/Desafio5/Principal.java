package Desafio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String confirma;
		Fisica pessoaf = new Fisica("Otavio", "46302556805", "571649105");
		
		System.out.println("O seu nome é: " + pessoaf.getNome());
		System.out.println("O seu cpf é: " + pessoaf.getCpf());
		System.out.println("O seu rg é: " +pessoaf.getRg());
		
		System.out.print("Está correto seus dados ?");
		confirma = ler.next();
		
		if (confirma.equals("Sim")) {
			System.out.println("Seja-Bem vindo: " + pessoaf.getNome());
		}
		else {
			System.out.println("Favor digitar os dados corretamente!");
		}
		
		ler.close();
	}
	
}
