package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int n;
		
		System.out.println("Informe um valor:");
		n = teclado.nextInt();
		
		if(n > 0) {
			System.out.println("valor positvo\n" + n);
			
		}else {
			if(n < 0){
			System.out.println("valor negativo\n " + n);
		}
	}
		teclado.close();
	}
}
