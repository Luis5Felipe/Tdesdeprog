import java.util.Scanner;

public class questao4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o nome do empregado:");
	        String nome = scanner.nextLine();
	        System.out.println("Digite o sexo (M/F):");
	        char sexo = scanner.next().toUpperCase().charAt(0);
	        System.out.println("Digite o salário bruto:");
	        double salarioBruto = scanner.nextDouble();

	        double desconto = sexo == 'M' ? 0.05 : 0.03;
	        double valorDesconto = salarioBruto * desconto;
	        double salarioLiquido = salarioBruto - valorDesconto;

	        System.out.printf("Desconto: R$ %.2f\n", valorDesconto);
	        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
	        scanner.close();
	    }
}
