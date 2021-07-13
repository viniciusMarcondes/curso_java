package br.com.naotemimpresa.secao03;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int metros, centimetro;
		
		System.out.println("Informe os metros:");
		metros = teclado.nextInt();
		
		centimetro = (metros * 100);
		
		System.out.println(metros +"Em centimetros:"+ centimetro);
		
		teclado.close();

	}

}
