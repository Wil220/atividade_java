package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<>();


		numeros.add(0, 2);
		numeros.add(1, 5);
		numeros.add(2, 1);
		numeros.add(3, 3);
		numeros.add(4, 4);
		numeros.add(5, 9);
		numeros.add(6, 7);
		numeros.add(7, 8);
		numeros.add(8, 10);
		numeros.add(8, 6);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Digite o número que você deseja encontrar: ");
			int numeroBusca = scanner.nextInt();


			if (numeros.contains(numeroBusca)) {

				int posicao = numeros.indexOf(numeroBusca);
				System.out.println("O número " + numeroBusca + " está localizado na posição: " + posicao);
			} else {

				System.out.println("O número " + numeroBusca + " não foi encontrado!");
			}

			System.out.print("Deseja fazer outra busca? (sim/não): ");
			String resposta = scanner.next();


			if (resposta.equalsIgnoreCase("não")) {
				System.out.println("Até a proxima!!! ");
				break;
			}
		}
	}
}
