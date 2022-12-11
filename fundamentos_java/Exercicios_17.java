package fundamentos_java;

import java.util.Scanner;

public class Exercicios_17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um inteiro:");
		int x = entrada.nextInt();
		
		
		if (x % 2 == 0) {
			System.out.println("é par");
			x = x/2;
			System.out.println(x);
		}
		else {
			System.out.println("é impar");
			x = 3 *x + 1;
			System.out.println(x);
		}

	}

}
