package br.com.naotemimpresa.secao07;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int nome, senha;
		
		System.out.println("Informe o nome de usuario:");
		nome = teclado.nextInt();
		
		System.out.println("Inform a senha :");
		senha = teclado.nextInt();
		
		while(nome.equals(senha)) {
			System.out.println("Erro o nome de usuario e senha dever ser diverentes");
			System.out.println("Informe o nome de usuario:");
			nome = teclado.nextInt();
			
			System.out.println("Inform a senha :");
			senha = teclado.nextInt();
		}
		
		teclado.close();
			
	}

}
