package interator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Set<Integer> numeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", (i + 1));
			numeros.add(sc.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();

		System.out.println("\nListar dados do Set: ");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

		sc.close();
	}
}