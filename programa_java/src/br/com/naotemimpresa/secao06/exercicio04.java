package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		float altura, peso_ideal;
		char sexo;
		
		System.out.println("Qual a sua altura:");
		altura = teclado.nextFloat();
		
		System.out.println("Qual o seu sexo m/f:");
		sexo = teclado.next().charAt(0);
		
		if(sexo == 'm' ) {
			peso_ideal = (float)(altura * 72.7) - 58;
			System.out.printf("Seu peso ideal é %.2f:" , peso_ideal);
		}
			if(sexo == 'f') {
				peso_ideal = (float) ((altura * 62.1) - 44.1);
				System.out.printf("Seu peso ideal é %.2f:" , peso_ideal);
			}
			if(sexo != 'm'  && sexo != 'f') {
				System.out.println("Sexo não identificado");
				peso_ideal = 0;
			}
		
		teclado.close();

	}

}
