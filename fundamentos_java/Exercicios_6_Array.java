package fundamentos_java;

import java.util.Scanner;

public class Exercicios_6_Array {

	public static void main(String[] args) {
		int listaArray[] = {10,20,30,40,50,45,32};
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0 ; i< listaArray.length; i++) {
			System.out.println("Digite um valor para verificar :");
			int resposta = entrada.nextInt();
			if (resposta == listaArray[i]) {
				System.out.println("contem");
				break;
			}
			else {
				System.out.println("nao está!");
				break;
			}

	}}

}
