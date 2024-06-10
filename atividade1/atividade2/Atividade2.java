package atividade2;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediafinal;
		
		System.out.println("digite sua nota ");
		nota1 = sc.nextFloat();
		System.out.println("digite sua nota ");
		nota2 = sc.nextFloat();
		System.out.println("digite sua nota ");
		nota3 = sc.nextFloat();
		System.out.println("digite sua nota ");
		nota4 = sc.nextFloat();
		mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("a media entre essas notas é %.1f", mediafinal);		
		
		sc.close();
	}
}
