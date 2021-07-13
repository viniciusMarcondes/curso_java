package br.com.naotemimpresa.secao07;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int maior = -999, menor = 999, soma = 0, numero;
		float media;
		
		for(int i = 0;i <= 10;i ++) {
			System.out.println("Informe um valor:");
			numero = teclado.nextInt();
			
			if(numero > 0) {
				if (numero > maior) {
					maior = numero;
				}
				if(numero < menor) {
					menor = numero;
				}
				soma = soma + numero;
			}else{
				i --;
			}
		}
		media = soma / 10;
		System.out.println("O maior numero é:"+ maior);
		System.out.println("O mener numero é:"+ menor);
		System.out.println("A media dos numeros é:"+ media);
	}

}
