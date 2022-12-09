package fundamentos_java;

public class Exercicios_14 {

	public static void main(String[] args) {
		double cont = 0;
		double cont2 = 0; 
		
		for (int i = 50 ; i>0 ; i--) {
			if (i%2 != 0 ) {
				System.out.println("e impar : "+i);
				cont += i;
				cont2 ++;
			}
			
		}
		System.out.println(cont);
		System.out.println(cont2);

	}

}
