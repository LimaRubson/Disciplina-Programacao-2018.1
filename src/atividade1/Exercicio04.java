package atividade1;

import java.util.Scanner;

/*
 
  Escrever um programa que pede o nome e a idade de uma pessoa e imprime
  uma mensagem com tais informações.
  
*/

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		
				
		System.out.println("Olá " + nome + "." + " Você tem " + idade + " anos");

	}

}
