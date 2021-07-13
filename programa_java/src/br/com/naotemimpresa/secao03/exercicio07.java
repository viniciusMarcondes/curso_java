package br.com.naotemimpresa.secao03;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		float peso_ideal, altura;
		
		System.out.println("Qual a sua altura:");
		altura = teclado.nextFloat();
		
		peso_ideal = (float)(altura * 72.7) - 58;
		
		System.out.printf("Seu peso ideal é: %.2f",peso_ideal);
		
		teclado.close();

	}

}
