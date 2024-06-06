package atividade3;

import java.util.Locale;
import java.util.Scanner;

public class exercicos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    float n1, n2, n3, n4, calculo;
	    
		System.out.println("Número 1 ");
		n1 = sc.nextFloat();
		
		System.out.println("número 2 ");
		n2 = sc.nextFloat();
		
		System.out.println("número 3 ");
		n3 = sc.nextFloat();
		
		System.out.println("número 4 ");
		n4 = sc.nextFloat();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença %.2f", calculo);	
	sc.close();	
	}
}
