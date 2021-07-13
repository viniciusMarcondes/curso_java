package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Quantos anos voce tem:");
		idade = teclado.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
			
		}else if(idade >= 8  && idade <=11) {
			System.out.println("Infantil B");
			
		}else if(idade >=12 && idade <=13) {
			System.out.println("Juvenul A");
			
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
			
		}else if (idade >= 18 ) {
			System.out.println("Aduto");
		}
			
		teclado.close();
	}
}