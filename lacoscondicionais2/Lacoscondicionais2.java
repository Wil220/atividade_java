package lacoscondicionais2;

import java.util.Scanner;

public class Lacoscondicionais2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero1;

		System.out.println("digite um numero");
		numero1 = sc.nextInt();



		if (numero1 %2==0) {
			if (numero1 < 0) {
				System.out.printf("O número %d é par e negativo!", numero1);
			}else {
				System.out.printf("O número %d é par e positivo!", numero1);
			}
		}else {

			if (numero1 %3==0) {
				if (numero1 < 0) {
					System.out.printf("O número %d é impar e negativo!", numero1);
				}else {

					System.out.printf("O número %d é impar e positivo!", numero1);
				}
			}else {
			}
			sc.close();

		}
	}
}
