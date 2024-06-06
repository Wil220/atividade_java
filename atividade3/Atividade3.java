package atividade3;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float salariobruto, adicionalnoturno, horasextras, descontos, salarioliquido;
		
		System.out.println("Escreva seu salario");
		salariobruto = sc.nextFloat();
		
		System.out.println("Escreva seu adicional noturno");
		adicionalnoturno = sc.nextFloat();
		
		System.out.println("Escreva suas horas extras");
		horasextras = sc.nextFloat();
		
		System.out.println("Digite seu desconto");
		descontos = sc.nextFloat();
		
		salarioliquido = salariobruto + adicionalnoturno + (horasextras * 5) - descontos;
		
		System.out.printf("Seu salário liquido é %.2f", salarioliquido);	
		
		sc.close();
	}
}