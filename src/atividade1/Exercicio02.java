package atividade1;

import java.util.Scanner;

/*
 Escreva um programa que leia uma String, conte quantos caracteres desta
 String são iguais a 'a' e substitua os que forem iguais a 'a' por 'b'. O 
 programa deve imprimir o número de caracteres modificados e a String modificada.
*/

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		String objeto = "casa";
		int cont = 0;
		
		for(int i = objeto.length()-1; i >= 0; i--) {
			
			if(objeto.charAt(i) == 'a') {
				cont++;
			}
		}
		
		for(int i = objeto.length()-1; i >= 0; i--) {
			
			if(objeto.charAt(i) == 'a') {
				objeto = objeto.replace(objeto.charAt(i), 'b');
			}
		}
		
		System.out.println("Número de caracteres iguais a 'a': " + cont);
		System.out.println("String modificada: " + objeto);
		
	}

}
