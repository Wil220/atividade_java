package Matriz;
import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;

		String diagonalPrincipal = "", diagonalSecundaria = "";
		Scanner leia = new Scanner(System.in);    

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {

	    System.out.println("Digite o numero da posição: (" + indiceI + "," + indiceJ + "): ");
	    matriz[indiceI][indiceJ] = leia.nextInt();            }
		}

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			diagonalPrincipal += matriz[indiceI][indiceI] + " ";           
			somaPrincipal += matriz[indiceI][indiceI];

		}
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			diagonalSecundaria += matriz[indiceI][matriz.length - 1 - indiceI] + " ";
			somaSecundaria += matriz[indiceI][matriz.length - 1 - indiceI];

		}
		System.out.println("Elementos da Diagonal Principal:\n");
		System.out.println(diagonalPrincipal);
		System.out.println("\n\nElementos da Diagonal Secundária:\n");
		System.out.println(diagonalSecundaria);
		System.out.println("\n\nSoma de todos Elementos da Diagonal Principal:\n");
		System.out.println(somaPrincipal);
		System.out.println("\n\nSoma de todos Elementos da Diagonal Secundária:\n");
		System.out.println(somaSecundaria);
		leia.close();
	}
}