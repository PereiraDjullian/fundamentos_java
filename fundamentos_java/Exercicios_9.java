package fundamentos_java;

import java.util.Scanner;

public class Exercicios_9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero:");
		double num1 = entrada.nextDouble();
		System.out.println("digite um numero:");
		double num2 = entrada.nextDouble();
		System.out.println("digite um numero:");
		double num3 = entrada.nextDouble();
		
		double maior = num1;
		
		if(num2 > maior) {
			maior = num2;
			
		}
		if(num3 > maior ){
			maior = num3;
			
		}
		System.out.println("Maior :"+ maior);
	 

	}

}
