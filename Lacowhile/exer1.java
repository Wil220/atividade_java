package Lacowhile;

import java.util.Scanner;

public class exer1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = 0;
		int totalmenores21 = 0;
		int totalmaiores50 = 0;

		while (idade >= 0) {

			System.out.println("Digite as idades: ");
			idade = sc.nextInt();

			if (idade >= 0 && idade <21) {
				totalmenores21++;
			}
			if (idade > 50) {
				totalmaiores50++;
			}

		}
		System.out.println("Total de pesseoas menores de 21: "+ totalmenores21);
		System.out.println("Total de pessoas maiores de 50: "+ totalmaiores50);

		sc.close();

	}
}