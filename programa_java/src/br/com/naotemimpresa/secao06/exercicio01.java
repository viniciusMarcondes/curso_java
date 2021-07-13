package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		System.out.println("informe um valor:");
		numero = teclado.nextInt();
		
		if (numero > 100) {
			System.out.println(numero);
		}else {
			System.out.println(0);
		}
		teclado.close();

	}

}
