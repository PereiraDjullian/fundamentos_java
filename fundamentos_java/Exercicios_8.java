package fundamentos_java;

import java.util.Scanner;

public class Exercicios_8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero:");
		double r = entrada.nextInt();
		if (r == 2) {System.out.println("segunda");}
		else if (r == 3) {System.out.println("terca");}
		else if (r == 4) {System.out.println("quarta");}
		else if (r == 5) {System.out.println("quinta");}
		else if (r == 6) {System.out.println("sexta");}
		else if (r == 7) {System.out.println("segunda");}
		else if (r == 1) {System.out.println("domingo");}
		else {System.out.println("digite um valor valido!");}

	}

}
