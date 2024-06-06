package lacoswitch;

import java.util.Locale;
import java.util.Scanner;

public class  Lacoswitch1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int num, quantidade;
		float preco = 0, valor;
		String produto = "";
		Scanner sc = new Scanner(System.in);

		System.out.printf("###### Menu ######\n");
		System.out.printf("1 - Cachorro Quente\n");
		System.out.printf("2 - X-Salada\n");
		System.out.printf("3 - X-Bacon\n");
		System.out.printf("4 - Bauru\n");
		System.out.printf("5 - Refrigerante\n");
		System.out.printf("6 - Suco de laranja\n");
		
		System.out.printf("\nDigite o número Produto ");
		num = sc.nextInt();

		System.out.printf("Digite a Quantidade ");
		quantidade = sc.nextInt();

		switch (num) {
		case 1:
			preco = 12.00f;
			produto = "Cachorro Quente";
			break;
		case 2:
			preco = 18.00f;
			produto = "X-Salada";
			break;
		case 3:
			preco = 20.00f;
			produto = "X-Bacon";
			break;
		case 4:
			preco = 10.00f;
			produto = "Bauru";
			break;
		case 5:
			preco = 6.00f;
			produto = "Refrigerante";
			break;
		case 6:
			preco = 15.00f;
			produto = "Suco de laranja";
			break;
		}

		valor = quantidade * preco;

		System.out.println("\nProduto " + produto);
		System.out.println("Quantidade " + quantidade );
		System.out.printf("Valor total R$ %.2f", valor);

		sc.close();
	}

}