package pilha;

import java.util.Scanner;
import java.util.Stack;

public class exer1 {


	public static void main(String[] args) {
		// TODO Auto-generated STRING stub

		try (Scanner sc = new Scanner(System.in)) {
			Stack<String> pilha = new Stack<String>();

			int Livro ; 
			
			while(true) {
				
				System.out.println("""
						1 - Adicionar livro 
						2 - Listar todos Livros
						3 - Retitrar livro
						0 - Sair
						""");
					Livro = sc.nextInt();

					switch(Livro) {
					case 1:
						sc.nextLine();
						System.out.println("\nAdicione o um do Livro: ");
						pilha.push(sc.nextLine());
						System.out.println("\nLivro adicionado");

					case 2:
						System.out.println("\nLivros: ");
						pilha.peek();
						System.out.println(pilha);
						System.out.println("\nLista atualizada: ");
						break;

					case 3:
						if (pilha.isEmpty()) {
							System.out.println("\nA pilha esta vazia: ");
							break;
						}
						System.out.println("\nLivro removido: " + pilha.pop() );
						System.out.println(pilha);
						break;

					case 0:
						System.out.println("\nAté a proxima!!");
						return;
					}
				}
			}
		}
	}