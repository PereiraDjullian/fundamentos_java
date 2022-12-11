package fundamentos_java;

import java.util.Scanner;

public class Exercicios_1_Array {

	public static void main(String[] args) {
		double faturas[] = new double[12];
		double soma = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		for( int i = 0; i < faturas.length; i++) {
			System.out.println("Digite a o valor da fatura  :"+(i+1));
			faturas[i] = entrada.nextDouble();
			soma += faturas[i];
			
			
		}
		System.out.println("media das faturas"+(soma/faturas.length));
		System.out.println("soma dos valores das faturas :"+ soma);

	}

}
