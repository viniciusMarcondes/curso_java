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
			System.out.println("O numero � par");
		}else{
			System.out.println("O numero � impar");
		}
		if(numero > 0) {
			System.out.println("O numero � positivo");
		}else{
			if(numero < 0)
			System.out.println("O numero � negativo");
		}
		teclado.close();
	}

}
