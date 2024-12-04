import java.util.Scanner;

public class questao5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o nome do empregado:");
        String nome = scanner.next();
        System.out.println("Digite o salário bruto:");
        double salarioBruto = scanner.nextDouble();

        double desconto;
        if (salarioBruto < salarioMinimo) {
            desconto = 0.02;
        } else if (salarioBruto == salarioMinimo) {
            desconto = 0.05;
        } else {
            desconto = 0.08;
        }

        double valorDesconto = salarioBruto * desconto;
        double salarioLiquido = salarioBruto - valorDesconto;

        System.out.printf("Desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
        scanner.close();
    }
}
