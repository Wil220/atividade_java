package lacoscondicionais1;

import java.util.Scanner;

public class Lacoscondicionais1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		int A, B, C, soma;

		System.out.println("Digite o número A");
		A = sc.nextInt();

		System.out.println("Digite o número B");
		B = sc.nextInt();

		System.out.println("Digite o número C");
		C = sc.nextInt();

		soma = A + B;

		if (soma > C){
			System.out.println("A soma de A + B é maior que C");
		}

		if (soma == C){
			System.out.println("A soma de A + B é igual a C");
		}
		if (soma < C){
			System.out.println("A soma de A + B é menor que C");
		}
		sc.close();

	}
}