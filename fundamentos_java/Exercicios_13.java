package fundamentos_java;

import java.util.Scanner;

public class Exercicios_13 {

	public static void main(String[] args) {
		int intervalo,i=1,contImpar=0,contPar=0;
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite o intervalo:");
		intervalo = entrada.nextInt();
		
		while (i < intervalo) {
			  
			 if (i % 2 != 0) {
				   
				  contImpar = i;
				  System.out.println("impares : "+ contImpar);
	
			 }
			 if (i % 2 == 0 ) {
				 
				 contPar = i;
				
				 System.out.println("pares : "+ contPar);
			 }	
			 
			 		i++;

	}
		
		}


}
