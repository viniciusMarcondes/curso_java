package br.com.naotemimpresa.secao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num1, num2, multiplicacao, soma;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("informe o primeiro numero:");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo:");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		
		multiplicacao = soma * num1;
		
		System.out.print("O resultado da multiplição :" + multiplicacao);
		
		teclado.close();
	}
}

