import java.util.Scanner;

public class Lacoswitch1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] produtos = {
            {"1", "Cachorro Quente", "10.00"},
            {"2", "X-Salada", "15.00"},
            {"3", "X-Bacon", "18.00"},
            {"4", "Bauru", "12.00"},
            {"5", "Refrigerante", "8.00"},
            {"6", "Suco de laranja", "13.00"},
        };

        System.out.print("Digite o código do produto: ");
        int codigoProduto = scanner.nextInt();

        if (codigoProduto < 1 || codigoProduto > produtos.length) {
            System.out.println("Código do produto inválido!");
            return;
        }

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        String[] produtoSelecionado = produtos[codigoProduto - 1];

        double valorTotal = Double.parseDouble(produtoSelecionado[2]) * quantidade;

        System.out.println("\nProduto: " + produtoSelecionado[1]);
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
    }
}