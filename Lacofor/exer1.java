package Lacofor;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroinicio  ;
		int numerointervalo ;

		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o primeiro número do intervalo: ");
		numeroinicio = sc.nextInt();
		System.out.println("Digite o Ultimo número do intervalo: ");
		numerointervalo = sc.nextInt();

		if (numeroinicio <= numerointervalo) {
			System.out.println("No Intervalo entre " + numeroinicio + " e " + numerointervalo + ":");
			for (int numero = numeroinicio; numero <= numerointervalo; numero++) 
				if (numero % 3 == 0 && numero % 5 == 0) {
					System.out.println(numero + " é múltiplo de 3 e 5");
				}
		} else{
			System.out.println("Intervalo inválido: ");
		}
		sc.close();
	}
}