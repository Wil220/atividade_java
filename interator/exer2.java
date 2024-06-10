package interator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exer2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		numeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		while (true) {
			System.out.print("Digite o número que você deseja encontrar: ");
			int numeroBusca = sc.nextInt();


			if (numeros.contains(numeroBusca)) {

				System.out.println("O número " + numeroBusca + " foi encontrado: ");
				break;
			} else {
				System.out.println("O número " + numeroBusca + " não foi econtrado: ");
				break;
			}
		}
	}
}