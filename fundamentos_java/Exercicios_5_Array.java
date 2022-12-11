package fundamentos_java;

public class Exercicios_5_Array {

	public static void main(String[] args) {
		int array1[] = {32,25,50,10,16,30};
		int array2[] = {8,2,9,11,15,15,45};
		int array3[] = new int [13];
		int manobra=0;
		
		
		for (int i = 0; i < 6; i++ ) { // INSERIR VALORES DO ARRAY1 NO ARRAY3
			array3[i] = array1[i];
			
			
		}
		for (int j = 6 ; j < array3.length;j++) { // INSERIR VALORES DO ARRAY2 NO ARRAY3
			array3[j] = array2[manobra]; 
			manobra++;
		}
		 /*for (int k = 0 ; k < array3.length; k++) { // MOSTRAR OS ITENS DO ARRAY NA ORDEM QUE  FOI INSERIDA
			System.out.println(array3[k]);
		}*/
		
		
		for (int l = 0 ; l < (array3.length-1);l++) { // ORDENACAO  DO ARRAY  
			for (int m = l+1; m < array3.length; m++) { // MUDAR DE ORDEM CRESCENTE PARA DECRESCENTE E SO MUDAR O <>
				if (array3[l]> array3[m]) {
					int x = array3[l];
					array3[l] = array3[m];
					array3[m] = x;
				}
			}
			
		}
		
		for(int y = 0 ; y <array3.length;y++) { // MOSTRAR O ARRAY ORDENADO
			System.out.println(array3[y]);
		}

	}

}
