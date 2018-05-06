package atividade1;

import java.util.Scanner;

/*
 Calcule as ra�zes de uma equa��o quadr�tica. Voc� ter� que ler os
 coeficientes do polin�mio.
*/

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a;//Nosso A da equa��o. Por exemplo: 2x+4y-6=0, nesse caso o 'a' � o 2.
		double b;//Nosso B da equa��o. Por exemplo: 2x+4y-6=0, nesse caso o 'b' � o 4.
		double c;//Nosso c da equa��o. Por exemplo: 2x+4y-6=0, nesse caso o 'c' � o -6.
		double delta;//Nosso Delta. Delta = 'b' ao quadrado menos 4 vezes 'a' vezes 'c'.
		double x1;//Nossa primeira raiz da equa��o.
		double x2;//Nossa segunda raiz da equa��o.
		
		System.out.println("Insira o valor de A: ");
		a = scan.nextDouble();
	
		while(a == 0) {
			
			System.out.println("O valor de A n�o pode ser zero a equa��o � do 2� grau!\n Digite outro valor!");
			System.out.println("Insira o valor de A: ");
			a = scan.nextDouble(); 
			
		}
		
		System.out.println("Insira o valor de B: ");
		b = scan.nextDouble();
		
		System.out.println("Insira o valor de C: ");
		c = scan.nextDouble();
		
		delta = ((b*b)-(4*a*c));//F�rmula do Delta 
		x1 = 0;//Definindo um valor inicial para o x1;
		x2 = 0;//Definindo um valor inicial para o x2;
		
		if(delta >= 0) {//Se o valor de delta for maior ou igual a zero podemos resolver...
	
			x1 = (-b + Math.sqrt(delta)) / (2*a);//Equa��o do x1;
			x2 = (-b - Math.sqrt(delta)) / (2*a);//Equa��o do x2;
			
			System.out.println("Delta vale: " + delta);//Mostra o valor de Delta
			System.out.println("\nx1 vale: " + x1 + "\n x2 vale: " + x2);//Mostra o x1 e x2.
			
		}else {
			
			System.out.println("N�o h� solu��es que possam ser expressas com o conjunto dos n�meros reais");//Avisa que o delta deu condi��o complexa
		
		}
	
	}

}
