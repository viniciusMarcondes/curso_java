package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int c;
		float n, e = 0, salario, valor_hora = (float) 10.00;
		
		System.out.println("Informe o codigo");
		c = teclado.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas");
		n = teclado.nextFloat();
		
		if(n > 50) {
			e = (float) (n - 50 ) *(float) 20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("Salario total R$ %.2f\n",salario);
			System.out.printf("salario exedente R$ %.2f\n",e);
		}else{
			salario = n * valor_hora;
			System.out.printf("Salario total R$ %.2f\n",salario);
			System.out.printf("salario exedente R$ %.2f\n",e);
		}
		teclado.close();
		}

}
