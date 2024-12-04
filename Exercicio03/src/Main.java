import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite o nome do produto:");
        produto.setNome(scanner.nextLine());

        System.out.println("Digite a quantidade do produto:");
        produto.setQuantidade(scanner.nextInt());

        System.out.println("Digite o preço unitário do produto:");
        produto.setPrecoUnitario(scanner.nextDouble());

      
        double valorTotal = produto.getQuantidade() * produto.getPrecoUnitario();

        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Valor total da compra: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
