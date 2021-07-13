package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		float peso_do_peixe, multa, exesso;
		
		System.out.println("Qual o peso do peixe:");
		peso_do_peixe = teclado.nextFloat();
		
		if(peso_do_peixe > 50) {
		   multa = (float) ((peso_do_peixe - 50) * 4.00);
		   System.out.printf("Voce deve pagar R$ %.2f em multa", multa);
		}else {
			multa = 0;
			exesso = 0;
			System.out.println("Multa"+ multa);
			System.out.println("exesso"+ exesso);
		}
		teclado.close();
	}

}
