package atividade1;

import java.util.Scanner;

/*
 Calcule as raízes de uma equação quadrática. Você terá que ler os
 coeficientes do polinômio.
*/

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a;//Nosso A da equação. Por exemplo: 2x+4y-6=0, nesse caso o 'a' é o 2.
		double b;//Nosso B da equação. Por exemplo: 2x+4y-6=0, nesse caso o 'b' é o 4.
		double c;//Nosso c da equação. Por exemplo: 2x+4y-6=0, nesse caso o 'c' é o -6.
		double delta;//Nosso Delta. Delta = 'b' ao quadrado menos 4 vezes 'a' vezes 'c'.
		double x1;//Nossa primeira raiz da equação.
		double x2;//Nossa segunda raiz da equação.
		
		System.out.println("Insira o valor de A: ");
		a = scan.nextDouble();
	
		while(a == 0) {
			
			System.out.println("O valor de A não pode ser zero a equação é do 2º grau!\n Digite outro valor!");
			System.out.println("Insira o valor de A: ");
			a = scan.nextDouble(); 
			
		}
		
		System.out.println("Insira o valor de B: ");
		b = scan.nextDouble();
		
		System.out.println("Insira o valor de C: ");
		c = scan.nextDouble();
		
		delta = ((b*b)-(4*a*c));//Fórmula do Delta 
		x1 = 0;//Definindo um valor inicial para o x1;
		x2 = 0;//Definindo um valor inicial para o x2;
		
		if(delta >= 0) {//Se o valor de delta for maior ou igual a zero podemos resolver...
	
			x1 = (-b + Math.sqrt(delta)) / (2*a);//Equação do x1;
			x2 = (-b - Math.sqrt(delta)) / (2*a);//Equação do x2;
			
			System.out.println("Delta vale: " + delta);//Mostra o valor de Delta
			System.out.println("\nx1 vale: " + x1 + "\n x2 vale: " + x2);//Mostra o x1 e x2.
			
		}else {
			
			System.out.println("Não há soluções que possam ser expressas com o conjunto dos números reais");//Avisa que o delta deu condição complexa
		
		}
	
	}

}
