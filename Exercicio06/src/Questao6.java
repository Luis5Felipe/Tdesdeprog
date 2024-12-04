import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, menores18 = 0;

        while (true) {
            System.out.println("Digite a idade da pessoa (ou -1 para sair):");
            int idade = scanner.nextInt();

            if (idade == -1) break;

            total++;
            if (idade < 18) menores18++;
        }

        if (total > 0) {
            double percMenores18 = (menores18 * 100.0) / total;
            double percMaiores18 = 100 - percMenores18;

            System.out.println("Total de pessoas cadastradas: " + total);
            System.out.printf("Porcentagem de menores de 18 anos: %.2f%%\n", percMenores18);
            System.out.printf("Porcentagem de 18 anos ou mais: %.2f%%\n", percMaiores18);
        } else {
            System.out.println("Nenhuma pessoa cadastrada.");
        }

        scanner.close();
    }
}
