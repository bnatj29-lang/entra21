import java.util.Scanner;

public class AulaDesvioCondicional {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		exercicio3();
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
		int numero2 = sc.nextInt ();
		
		if (numero1 > numero2 ) {
			System.out.print("O número maior é: " + numero1);
		} else {
			System.out.print("O número maior é: " + numero2);
		}
	}
	
	static void exercicio3() {
		
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		
		if (x > 0 ) {
		 System.out.print("Esse número é positivo.");
		} else if  (x < 0) {
			System.out.print("Esse numero é negativo.");
		} else {
			System.out.print("Esse número é igual a 0.");
		}
		}
	}

