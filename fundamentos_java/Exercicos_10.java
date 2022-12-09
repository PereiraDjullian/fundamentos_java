package fundamentos_java;

import java.util.Scanner;

public class Exercicos_10 {

	public static void main(String[] args) {
		int cont = 0;
		String res;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Telefonou para vítima? [1 = SIM / 2 = FALSO]");
		int resp1 = entrada.nextInt();
		if (resp1 == 1) {
			cont = ++cont;
		}
		//System.out.println(cont);
		
		System.out.println("Esteve no local do crime? [1 = SIM / 2 = FALSO]");
		int resp2 = entrada.nextInt();
		if (resp2 == 1) {
			cont = ++cont;
		}
		//System.out.println(cont);
		
		System.out.println("Mora perto da vítma? [1 = SIM / 2 = FALSO]");
		int resp3 = entrada.nextInt();
		if (resp3 == 1) {
			cont = ++cont;
		}
		
		
		System.out.println("Devia para vítma? [1 = SIM / 2 = FALSO]");
		int resp4 = entrada.nextInt();
		if (resp4 == 1) {
			cont = ++cont;
		}
		
		//System.out.println(cont);
		
		System.out.println("Já trabalhou para vítima? [1 = SIM / 2 = FALSO]");
		int resp5 = entrada.nextInt();
		if (resp5 == 1) {
			cont = ++cont;
		}
		
		if (cont == 1) {
			System.out.println("INOCENTE");
		}
		
		if (cont == 2) {
			System.out.println("SUSPEITO");
		}
		if (cont == 3 || cont == 4) {
			System.out.println("CÚMPLICE!");
		}

		//if (cont == 4) {
			//System.out.println("CÚMPLICE!");	
		//}
		else if (cont == 5){
			System.out.println("ASSASSINO");
		}
		
		
		 res  = cont < 2 ? "inocent":cont == 2 ? "suspeito" : cont <= 4 ? "cumplice" : "assassino";
		 // usando operador ternario
		 
		
		System.out.println(res);

	}

}
