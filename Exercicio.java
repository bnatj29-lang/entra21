import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		exercicio1();
		exercicio2();
	}

	// Exercício 1: dobro dos números
	static void exercicio1() {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um numero: ");
			numeros[i] = input.nextInt();
		}

		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dobro: " + (numeros[i] * 2));
		}
	}

	// Exercício 2: pares e ímpares
	static void exercicio2() {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um numero: ");
			numeros[i] = input.nextInt();
		}

		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println("Numero par: " + numeros[i]);
			} else {
				System.out.println("Numero impar: " + numeros[i]);
			}
		}
	}
}


	



		




