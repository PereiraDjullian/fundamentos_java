package fundamentos_java;
import java.util.Arrays;

public class Exercicios_1_String {

	public static void main(String[] args) {
		String arrayString[] = {"tres","um","cinco","dez","vinte","quinze"};
		String arrayToString = Arrays.toString(arrayString);
		Arrays.sort(arrayString);
		
		System.out.println(Arrays.toString(arrayString));

	}

}
