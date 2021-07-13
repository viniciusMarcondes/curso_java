package br.com.naotemimpresa.secao07;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		System.out.println("Informe um numero entre 1 á 10:");
		numero = teclado.nextInt();
		
		while (numero < 1 || numero > 10) {
			System.out.println("Informe um numero entre 1 á 10:");
			numero = teclado.nextInt();
		}
		for(int i = 1;i < 10; i++) {
			System.out.printf("%d X %d = %d\n ", numero, i, (numero * i));
			
		}
		teclado.close();
	}
	
}
