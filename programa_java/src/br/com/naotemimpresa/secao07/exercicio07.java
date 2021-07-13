package br.com.naotemimpresa.secao07;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int contador_total = 0, contador_sit1 = 0, contador_sit2 = 0, contador_sit3 = 0, contador_sit4 = 0, identificacao, defeito;
		
		System.out.println("Informe a identificação");
		identificacao = teclado.nextInt();
		
		while(identificacao != 0) {
			
			System.out.println("1-nessecita de esfera");
			System.out.println("2-nessecita de limpeza");
			System.out.println("3-nessecita de cabo ou conector");
			System.out.println("4-quebrado ou inutilizado ");
			System.out.println("informe o defeito ");
			
			defeito = teclado.nextInt();
			if(defeito == 1) {
				contador_sit1 = contador_sit1 + 1;
			}
			if(defeito == 2) {
				contador_sit2 = contador_sit2 + 1;
			}
			if(defeito == 3) {
				contador_sit3 = contador_sit3 + 1;
			}
			if(defeito == 4) {
				contador_sit4 = contador_sit4 + 1;
			}
			contador_total = contador_total + 1;
			
			System.out.println("Informe a identificação");
			identificacao = teclado.nextInt();
		}
		float p1, p2, p3, p4;
		p1 = ((float)contador_sit1 /(float)contador_sit1 *(float) 100);
		p2 = ((float)contador_sit2 /(float)contador_sit2 *(float) 100);
		p3 = ((float)contador_sit3 /(float)contador_sit3 *(float) 100);
		p4 = ((float)contador_sit4 /(float)contador_sit4 *(float) 100);
		
		System.out.printf("quantidade de mouses %d\n", contador_total);
		System.out.println("situação \t\t\t\t\tQuantidade \tpersentual");
		System.out.printf("1-nessecidade de esfera \t\t\t%d \t\t%.2f\n",contador_sit1,p1);
		System.out.printf("2-nessecidade de limpeza \t\t\t%d \t\t%.2f\n",contador_sit2,p2);
		System.out.printf("3-nessecidade de cabo ou conector\t\t%d \t\t%.2f\n",contador_sit3,p3);
		System.out.printf("4-quebrado ou inutilizado  \t\t\t%d \t\t%.2f\n",contador_sit4,p4);
		teclado.close();
	}

}
