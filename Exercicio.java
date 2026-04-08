import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um numero: ");
			numeros[i] = input.nextInt();
		}

		System.out.println("");

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {
				System.out.println("Numero par: " + numeros[i]);
			} else {
				System.out.println("Número Impar: " + numeros[i]);
			}
		}
	}
}
