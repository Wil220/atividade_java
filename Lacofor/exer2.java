package Lacofor;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0 ;
        int par = 0 ;
        int impar = 0;

        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite o um número: "+ par );
        
        for (impar = 0+1; par <= 10; par++) {
            numero = sc.nextInt();
            
            if (numero  % 2 == 1) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("\nTotal de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);

        sc.close();
    }
}