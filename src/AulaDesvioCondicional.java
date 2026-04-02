import java.util.Scanner;

public class AulaDesvioCondicional {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// exercicio1();
		// exercicio2();
		// exercicio3();
		// exercicio4();
		// exercicio5();
		// exercicio6();
		// exercicio7();
		// exercicio8();
	}

	static void exercicio1() {

		System.out.print("Digite um numero inteiro: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.print("O número é par.");
		} else {
			System.out.print("O numero é imprar.");
		}
	}

	static void exercicio2() {

		System.out.print("Digite um numero: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite outro numero: ");
		int numero2 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.print("O número maior é: " + numero1);
		} else {
			System.out.print("O número maior é: " + numero2);
		}
	}

	static void exercicio3() {

		System.out.print("Digite um número: ");
		int x = sc.nextInt();

		if (x > 0) {
			System.out.print("Esse número é positivo.");
		} else if (x < 0) {
			System.out.print("Esse numero é negativo.");
		} else {
			System.out.print("Esse número é igual a 0.");
		}
	}

	static void exercicio4() {

		System.out.print("Qual é a sua nota? ");
		double nota = sc.nextDouble();

		if (nota >= 6) {
			System.out.printf("Aprovado!");
		} else {
			System.out.printf("Reprovado!");
		}
	}

	static void exercicio5() {

		System.out.print("Qual a sua idade? ");
		int idade = sc.nextInt();

		if (idade >= 16) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Não pode votar!");
		}
	}

	static void exercicio6() {

		System.out.print("Digite um numero: ");
		double a = sc.nextDouble();

		System.out.print("Digite um numero: ");
		double b = sc.nextDouble();

		System.out.print("Digite um numero: ");
		double c = sc.nextDouble();

		if (a > b && a > c) {
			System.out.print("O maior número é: " + a);
		} else if (b > a && b > c) {
			System.out.print("O maior numero é: " + b);
		} else {
			System.out.print("O maior numero é: " + c);
		}
	}

	static void exercicio7() {
		System.out.print("Digite um número de 0 a 10: ");
		int numero = sc.nextInt();

		if (numero <= 4) {
			System.out.print("Insuficiente");
		} else if (numero <= 6) {
			System.out.print("Regular");
		} else if (numero <= 8) {
			System.out.print("Bom");
		} else {
			System.out.print("Excelente");
		}
	}

	static void exercicio8() {

		System.out.print("Digite um numero: ");
		double a = sc.nextDouble();

		System.out.print("Digite um numero: ");
		double b = sc.nextDouble();

		System.out.print("Digite um numero: ");
		double c = sc.nextDouble();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Forma um triângulo");
		} else {
			System.out.println("Não forma um triângulo");
		}

	}
	


}
