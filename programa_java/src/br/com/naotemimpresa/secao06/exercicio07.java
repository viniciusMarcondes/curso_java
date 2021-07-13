package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int num1, num2, num3, num4, q1, q2, q3, q4;
		
		System.out.println("Informe o primeiro numero:");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo numero:");
		num2 = teclado.nextInt();
		System.out.println("Informe o terceiro numero:");
		num3 = teclado.nextInt();
		System.out.println("Informe o quarto numero:");
		num4 = teclado.nextInt();
		
		q1 = num1 * num1;
		q2 = num2 * num2;
		q3 = num3 * num3;
		q4 = num4 * num4;
		
		if(q3 >= 1000) {
			System.out.println(q3);
		}else{
			System.out.printf("Num1 %d Quadrado %d\n", num1, q1);
			System.out.printf("Num2 %d Quadrado %d\n", num2, q2);
			System.out.printf("Num3 %d Quadrado %d\n", num3, q3);
			System.out.printf("Num4 %d Quadrado %d\n", num4, q4);
		}
		teclado.close();
	}

}
