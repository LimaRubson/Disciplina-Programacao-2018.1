package atividade1;

/*
 	  Escreva um programa que leia uma String e remova todos os caracteres desta String que são iguais a ‘a’. Ao
	final, o programa deve imprimir a quantidade de caracteres removidos e a String modificada.
*/

public class Exercicio03 {

	public static void main(String[] args) {
		
		String objeto = "casamento";
		int cont = 0;
		
		for(int i = objeto.length()-1; i >= 0; i--) {
			
			if(objeto.charAt(i) == 'a') {
				
				cont++;
				
			}
			
		}
		
		for(int i = objeto.length()-1; i >= 0; i--) {
			
			if(objeto.charAt(i) == 'a') {
				
				objeto = objeto.replace(objeto.charAt(i), ' ');
				
			}
			
		}
		
		System.out.println("Caracteres igual a 'a' removidos: " + cont);
		System.out.println("String modificada: " + objeto);


	}

}
