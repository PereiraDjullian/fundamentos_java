package fundamentos_java;

import java.util.Scanner;

public class Exercicios_18 {

	public static void main(String[] args) {
double media,soma=0;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite a quantidade de alunos:");
		int n = entrada.nextInt();
		
		for (int i = 1; i<=n ;i++) {
			System.out.println("ditite a nota do aluno"+i);
			double nota = entrada.nextDouble();
			soma +=nota;
			//soma = soma + nota;
			
			
 		}
		media = soma /n;
		System.out.println("media da turma :"+media);

	}

}
