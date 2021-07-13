package br.com.naotemimpresa.secao08;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int p1, p2, p3, p4, somar, multiplicar;
		
		System.out.println("informe o resultado da prova 1");
		p1 = teclado.nextInt();
		
		System.out.println("informe o resultado da prova 2");
		p2 = teclado.nextInt();
		
		System.out.println("informe o resultado da prova 3");
		p3 = teclado.nextInt();
		
		System.out.println("informe o resultado da prova 4");
		p4 = teclado.nextInt();
		
		somar =(p1 + p2 + p3 + p4);
		
		multiplicar = (somar / 4);
		
		System.out.println("O resultado da prova é:"+ multiplicar);
		
		teclado.close();
	}

}
