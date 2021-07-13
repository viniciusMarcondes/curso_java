package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int n, par , impar;
		
		System.out.println("Informe um valor:");
		n = teclado.nextInt();
		
		if(n % 2 == 0) {
			par = n;
			System.out.println("par\n"+ n);
		}else{
			impar = n;
			System.out.println("impar\n"+ n);
		}
		
		teclado.close();

	}

}
