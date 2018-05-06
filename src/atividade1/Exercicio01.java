package atividade1;

import java.util.Scanner;

//Escreva um programa que imprima uma string lida do teclado do final para o início.

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		String nomeInverso = "";
		
		for(int i = nome.length()-1; i >= 0; i--) {
			
			nomeInverso += nome.charAt(i);
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Nome Inverso: " + nomeInverso);

	}

}
