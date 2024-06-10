package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEntre com as 5 cores: ");

		for (int i = 0; i < 5; i++) {
			String cor;
			do {
				cor = sc .nextLine();
				if (cor.isEmpty()) {
					System.out.println("\nCor inválida. Digite uma cor: ");
				}
			} while (cor.isEmpty()); 

			cores.add(cor);
		}

		System.out.println("\nLista de cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		Collections.sort(cores);
		System.out.println("\nCores ordenadas: ");
		for(String cor : cores) {

			System.out.println(cor);
		}
		sc.close(); 
	}
}