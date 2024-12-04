import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matriculas = new String[100];
        double[] salariosBrutos = new double[100];
        double[] descontos = new double[100];
        double[] salariosLiquidos = new double[100];

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite a matrícula do empregado: ");
            matriculas[i] = scanner.nextLine();

            System.out.print("Digite o salário bruto do empregado: ");
            salariosBrutos[i] = scanner.nextDouble();
            descontos[i] = salariosBrutos[i] * 0.11;
            salariosLiquidos[i] = salariosBrutos[i] - descontos[i];
            scanner.nextLine();
        }

        System.out.println("\nInformações dos empregados:");
        for (int i = 0; i < 100; i++) {
            System.out.printf("Matrícula: %s, Salário Bruto: R$ %.2f, Desconto: R$ %.2f, Salário Líquido: R$ %.2f%n",
                    matriculas[i], salariosBrutos[i], descontos[i], salariosLiquidos[i]);
        }
        scanner.close();
    }
}
