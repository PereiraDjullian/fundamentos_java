package fundamentos_java;

public class Exercicios_3_Array {

	public static void main(String[] args) {
		double kmDiarios[] = {105,200,55,170,95};
		double kmTotal=0;
		for (int i = 0 ;i <kmDiarios.length;i++) {
			kmTotal += kmDiarios[i]; 
		}
		System.out.println(kmTotal);
		System.out.println("qtde media dia :"+(kmTotal/kmDiarios.length));
		System.out.println("consumo Total de combustivel (L) :" +(kmTotal/8) );
		
		for (int j = 0; j <kmDiarios.length; j++) {
			System.out.println("consumo dia :"+ (j+1));
			System.out.println("qtde litros "+(kmDiarios[j]/8));
		}

	}

}
