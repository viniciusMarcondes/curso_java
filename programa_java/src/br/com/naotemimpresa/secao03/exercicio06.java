package br.com.naotemimpresa.secao03;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		float valor_por_hora, salario;
		int hora_trabalhadas ;
		
		System.out.println("Quantas horas voce trabalha:");
		hora_trabalhadas = teclado.nextInt();
		
		System.out.println("Quantos reais voce ganha por hora:");
		valor_por_hora = teclado.nextFloat();
		
		salario = (hora_trabalhadas * valor_por_hora);
		
		System.out.println("Seu salario é:"+ salario);
		
		teclado.close();

	}

}
