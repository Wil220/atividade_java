package Vetores;
import java.util.Scanner;
public class exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] vetor = {1, 3, 5, 6, 8, 10, 12, 14, 16, 18};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que você deseja encontrar: ");
        int numero = scanner.nextInt();
        
        int posicao = -1;

                for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
 
            	posicao = i;
                break;
            }
        }

                if (posicao != -1) {
            System.out.println("O número " + numero + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
        
        scanner.close();
    }
}
