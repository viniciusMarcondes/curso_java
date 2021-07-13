package br.com.naotemimpresa.secao03;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		
	    System.out.println("informe a quantidade minima:");
	    quantidade_minima = teclado.nextInt();
	    
	    System.out.print("informe a quantidade maxima:");
	    quantidade_maxima = teclado.nextInt();
	    
	    estoque_medio = (quantidade_maxima + quantidade_minima) / 2;
	    
	    System.out.println("o estoque medio :" + estoque_medio);
	    
	    teclado.close();
	    
	    

	}

}
