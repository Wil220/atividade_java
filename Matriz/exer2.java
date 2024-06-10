package Matriz;
import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[][] matriz = new float[10][4];
		float[] media = new float[10];
		float soma = 0.0f;
		int tamanhoLinha = 10, tamanhoColuna = 4;

		Scanner leia = new Scanner(System.in);


		for (int indiceI = 0; indiceI < tamanhoLinha; indiceI++) {


			for (int indiceJ = 0; indiceJ < tamanhoColuna; indiceJ++) {

				System.out.println("Digite a " + (indiceJ + 1) + "º nota do participante: " + (indiceI + 1) + ": ");
				matriz[indiceI][indiceJ] = leia.nextFloat();

			}

		}

		for (int indiceI = 0; indiceI < tamanhoLinha; indiceI++) {

			for (int indiceJ = 0; indiceJ < tamanhoColuna; indiceJ++) {

				soma += matriz[indiceI][indiceJ];

			}

			media[indiceI] = soma / tamanhoColuna;
			soma = 0.0f;

		}

		for (int indiceI = 0; indiceI < media.length; indiceI++) {
			System.out.printf("\nMédia do participante: " + (indiceI + 1) + ": %.1f", (media[indiceI]));
		}

	}

}
