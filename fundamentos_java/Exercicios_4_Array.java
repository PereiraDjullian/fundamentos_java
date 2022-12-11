package fundamentos_java;

public class Exercicios_4_Array {

	public static void main(String[] args) {
		double diasSemana[] = {220,120,450,650,300,1050,0};
		double soma=0;
		for (int i =0 ; i< diasSemana.length ;i++) {
			soma += diasSemana[i];
			
		}
		System.out.println("valor ganho na semna : "+ (soma));
		System.out.println("valor medio :"+ (soma/diasSemana.length));

	}

}
