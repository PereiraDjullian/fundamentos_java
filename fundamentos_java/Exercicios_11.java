package fundamentos_java;

import java.util.Scanner;

public class Exercicios_11 {

	public static void main(String[] args) {
		int qtdeAlunos,cont,i;
		double nota,soma = 0,media = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de ALUNOS:");
		qtdeAlunos = entrada.nextInt();
		System.out.println(qtdeAlunos);
		
		cont = qtdeAlunos;
		i = 0;
		while ( i < cont ) {
		
			System.out.println("Digite a nota do aluno :"+ (i+1));
			nota = entrada.nextDouble();
			soma += nota;
			i++;
			
		}
		media = soma / qtdeAlunos;
		System.out.println("media :"+media);
		System.out.println("soma  :"+soma);

	}

}
