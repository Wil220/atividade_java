package Lacodowhile;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int soma = 0;
		int contagem = 0;


		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero != 0 && numero % 3 == 0) {
				soma += numero;
				contagem++;
			}
		} while (numero != 0);

		if (contagem > 0) {
			double media = (double) soma / contagem;
			System.out.println("A média dos números múltiplos de 3 é: " + media);
		} else {
		}

		sc.close();
	}
}