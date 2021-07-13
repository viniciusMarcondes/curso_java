package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Informe um numro:");
		numero = teclado.nextInt();
		if(numero % 2 == 0) {
			System.out.println("O numero é par");
		}else{
			System.out.println("O numero é impar");
		}
		if(numero > 0) {
			System.out.println("O numero é positivo");
		}else{
			if(numero < 0)
			System.out.println("O numero é negativo");
		}
		teclado.close();
	}

}
