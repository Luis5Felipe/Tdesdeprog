import java.util.Scanner;

public class questao8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o preço unitário:");
        double precoUnitario = scanner.nextDouble();
        System.out.println("Digite a forma de pagamento (1-Dinheiro, 2-Pix, 3-Débito, 4-Crédito):");
        int pagamento = scanner.nextInt();

        double desconto;
        switch (pagamento) {
            case 1 -> desconto = 0.10;
            case 2 -> desconto = 0.12;
            case 3 -> desconto = 0.05;
            case 4 -> desconto = 0.03;
            default -> {
                System.out.println("Forma de pagamento inválida.");
                return;
            }
        }

        double total = quantidade * precoUnitario;
        double valorDesconto = total * desconto;
        double valorFinal = total - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);
        scanner.close();
    }
}
