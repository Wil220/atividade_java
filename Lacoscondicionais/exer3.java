package Lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public final class exer3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do doador: ");
		String nome = scanner.nextLine();

		System.out.print("Digite a idade do doador: ");
		int idade = validarEntradaInt(scanner, "Idade inválida. Digite um número inteiro: ");

		String respostaDoacao;
		do {
			System.out.print("Primeira doação de sangue? (sim/não): ");
			respostaDoacao = scanner.next().toUpperCase();
		} while (!respostaDoacao.equals("SIM") && !respostaDoacao.equals("NÃO"));

		boolean primeiraDoacao = respostaDoacao.equals("SIM");

		String resultado = verificarAptidaoDoacao(nome, idade, primeiraDoacao);
		System.out.println(resultado);

		scanner.close();
	}

	private static int validarEntradaInt(Scanner scanner, String mensagemErro) {
		while (!scanner.hasNextInt()) {
			System.out.print(mensagemErro);
			scanner.next();
		}
		return scanner.nextInt();
	}

	private static String verificarAptidaoDoacao(String nome, int idade, boolean primeiraDoacao) {
		if (idade < 18 || idade > 69) {
			return nome + " não está apto para doar sangue por idade fora da faixa permitida.";
		} else {
			return nome + " está apto para doar sangue!";
		}
	}
}