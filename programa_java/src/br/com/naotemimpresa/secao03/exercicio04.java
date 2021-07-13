package br.com.naotemimpresa.secao03;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int num1, num2, soma;
		
		System.out.print("Informe o primeiro numero:");
		num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo numero:");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		
		System.out.print("A soma é:"+ soma);
		
		teclado.close();
	}

}
