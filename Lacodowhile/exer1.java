package Lacodowhile;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		int media = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Digite um numero");
			numero = sc.nextInt();

			if (numero % 3 == 0) {
				media += numero;
			}

		} while (numero != 0);

		System.out.println("\nA média de todos os números múltiplos de 3 é: " + soma);
		sc.close();
	}
}

