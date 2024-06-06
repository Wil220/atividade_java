package atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Digite seu salario");
		salario = sc.nextFloat();
		System.out.println("Digite o Abono");
		abono = sc.nextFloat();
		novoSalario = salario + abono;
		System.out.printf("seu novo salario é %.2f", novoSalario);

		sc.close();

	}

}
