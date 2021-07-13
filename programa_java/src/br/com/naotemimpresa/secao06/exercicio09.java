package br.com.naotemimpresa.secao06;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		float indice;
		
		System.out.println("Informe o indice de poluoção");
		indice = teclado.nextInt();
		
		if(indice >= 0.3 && indice <= 0.4) {
			System.out.println("Atenção: Industrias do primeiro grupo devem enserar as atividades");
		}else if(indice >= 0.4 && indice <= 0.5){
			System.out.println("Atenção: Industrias do segundo grupo devem enserar as atividade");
		}else if(indice >= 0.5){
			System.out.println("Atenção: Todos os grupos devem suspender as atividades");
		}
		teclado.close();
	}
}
