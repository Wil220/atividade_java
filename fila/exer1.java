package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exer1 {

	public static <string> void main(String[] args) {
		// TODO Auto-generated method stub



		Queue<string> fila = new LinkedList<string>();

		try (Scanner sc = new Scanner(System.in)) {
			int menu;
			while(true) {

				System.out.println("""
						1 - Adicionar cliente a Lista
						2 - Listar todos clientes a fila
						3 - Retitrar cliente na fila
						0 - Sair
						""");
				menu = sc.nextInt();

				switch(menu) {
				case 1:
					System.out.println("\nDigite o nome do Cliente: ");
					fila.add((string) sc.next());
					System.out.println("\nCliente adicionado: ");

				case 2:
					System.out.println("\nLista: ");
					fila.peek();
					System.out.println(fila);
					System.out.println("\nLista atualizada");
					break;

			     case 3:
                     if (!fila.isEmpty()) {
                         String removedCustomer = (String) fila.remove();
                         System.out.println("\nCliente removido: " + removedCustomer);
                     } else {
                         System.out.println("\nFila vazia.");
                     }
                     break;

				case 0:
					System.out.println("\nAté a proxima!!");
					return;
				}
			}
		}
	}
}