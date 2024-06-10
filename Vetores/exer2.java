package Vetores;
import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int[] vetor = new int[10];

		float soma = 0.0f, media = 0.0f;

		String indiceImpares="", elementosPares="";
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < vetor.length; indice++) {

			System.out.println("Digite o " + (indice + 1) + "º numero: ");
			vetor[indice] = leia.nextInt();

		}

		for (int indice = 1; indice < vetor.length; indice += 2) {

			indiceImpares += vetor[indice] + " ";
		}

		for (int indice = 0; indice < vetor.length; indice++) {

			if (vetor[indice] % 2 == 0)
				elementosPares += vetor[indice] + " ";

			soma += vetor[indice];

		}

		System.out.println("Elementos impares:\n");
		System.out.println(indiceImpares);
		System.out.println("\n\nElementos pares:\n");
		System.out.println(elementosPares);
		System.out.println("\n\nSomas Elemento é:\n");
		System.out.println(soma);

		media = soma / vetor.length;
		System.out.println("\n\nA Média dos Elementos é:\n");
		System.out.printf("%.2f",media);


	}

}