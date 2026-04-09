import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// exercicio1();
		// exercicio2();
		// exercicio3();
		// exercicio4();
		// exercicio5();
		exercicio6();
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

	// Exercicio 3: Valores invertidos
	static void exercicio3() {
		Scanner input = new Scanner(System.in);

		int[] posicoes = new int[10];

		for (int i = 0; i < posicoes.length; i++) {
			System.out.print("Digite um numero de 1 a 10: ");
			int numero = input.nextInt();

			if (numero < 1 || numero > 10) {
				System.out.println("Valor menor que 1 ou maior que 10.");
				i--;
			} else {
				posicoes[i] = numero;
			}
		}

		System.out.println("\nValores invertidos: ");
		for (int i = posicoes.length - 1; i >= 0; i--) {
			System.out.println(posicoes[i]);
		}
	}

	// Exercicio 4: Maior valor
	static void exercicio4() {
		Scanner input = new Scanner(System.in);

		int[] posicoes = new int[15];

		for (int i = 0; i < posicoes.length; i++) {
			System.out.print("Digite um numero: ");
			int numero = input.nextInt();
			posicoes[i] = numero;
		}

		int maior = posicoes[0];

		for (int i = 0; i < posicoes.length; i++) {
			if (posicoes[i] > maior) {
				maior = posicoes[i];
			}
		}

		System.out.println("O maior número é: " + maior);
	}

	static void exercicio5() {
		Scanner input = new Scanner(System.in);

		int[] posicoes = new int[8];

		// Parte 1: ler os números
		for (int i = 0; i < posicoes.length; i++) {
			System.out.print("Digite um numero: ");
			posicoes[i] = input.nextInt();
		}

		// Parte 2: ordenar em ordem crescente
		for (int i = 0; i < posicoes.length; i++) {
			for (int j = i + 1; j < posicoes.length; j++) {
				if (posicoes[i] > posicoes[j]) {

					int aux = posicoes[i];
					posicoes[i] = posicoes[j];
					posicoes[j] = aux;

				}
			}
		}
		// Parte 3: mostrar ordenado
		System.out.println("\nVetor em ordem crescente:");

		for (int i = 0; i < posicoes.length; i++) {
			System.out.println(posicoes[i]);
		}
	}

	static void exercicio6() {
		Scanner input = new Scanner(System.in);

		int[] posicoes = new int[10];

		// Parte 1: ler os números + somar
		int soma = 0;

		for (int i = 0; i < posicoes.length; i++) {
			System.out.print("Digite um numero: ");
			posicoes[i] = input.nextInt();
			soma += posicoes[i];
		}

		// Parte 2: calcular média
		double media = soma / 10.0;

		System.out.println("\nMédia: " + media);

		// Parte 3: mostrar números acima da média
		System.out.println("Numeros acima da media:");

		for (int i = 0; i < posicoes.length; i++) {
			if (posicoes[i] > media) {
				System.out.println(posicoes[i]);
			}
		}
	}
}