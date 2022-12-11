package fundamentos_java;

import java.util.Scanner;

public class Exercicios_2_Array {
	public static void main(String[] args) {
		double kmRodados[] = new double[14];
		double somaTotal = 0,somaSemana1 = 0,somaSemana2=0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		for (int i = 0;i<kmRodados.length;i++) {
			
			System.out.println("Digite a qtde de km rodados no dia :"+ (i+1));
			kmRodados[i] = entrada.nextDouble();
			somaTotal += kmRodados[i];
			
			
		}
		for (int j = 0;j<(kmRodados.length-7);j++) {
			somaSemana1 += kmRodados[j];
		}
		for(int k = 7;k < kmRodados.length;k++) {
			somaSemana2 += kmRodados[k];
			
		}
		System.out.println("media total :"+ (somaTotal/kmRodados.length));
		System.out.println("media semana1 :"+(somaSemana1/7) );
		System.out.println("media semana2 :"+(somaSemana2/7));
	}

}
