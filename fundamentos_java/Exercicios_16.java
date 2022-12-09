package fundamentos_java;

public class Exercicios_16 {

	public static void main(String[] args) {
		int cont = 0;
		for(int i = 1;i <=100;i++) {
			if(i%3 == 0) {
				System.out.println(i);
				cont += i;
			}
			
		}
		System.out.println(cont);

	}

}
