import java.util.Scanner;
public class questao1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int matricula1;
        double salario1, desconto1, salarioFinal1;

        
        int matricula2;
        double salario2, acrescimo2, salarioFinal2;

        
        System.out.println("Digite a matrícula do primeiro empregado:");
        matricula1 = scanner.nextInt();
        System.out.println("Digite o salário do primeiro empregado:");
        salario1 = scanner.nextDouble();

        
        System.out.println("Digite a matrícula do segundo empregado:");
        matricula2 = scanner.nextInt();
        System.out.println("Digite o salário do segundo empregado:");
        salario2 = scanner.nextDouble();

        
        desconto1 = salario1 * 0.05;
        salarioFinal1 = salario1 - desconto1;

        acrescimo2 = salario2 * 0.09;
        salarioFinal2 = salario2 + acrescimo2;

        System.out.printf("Empregado 1 - Matrícula: %d\n", matricula1);
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto1);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal1);

        System.out.println();

        System.out.printf("Empregado 2 - Matrícula: %d\n", matricula2);
        System.out.printf("Valor do acréscimo: R$ %.2f\n", acrescimo2);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal2);

        scanner.close();
    }
}
