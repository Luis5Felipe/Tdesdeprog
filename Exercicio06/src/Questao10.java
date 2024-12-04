import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, pares = 0, impares = 0;

        while (true) {
            System.out.println("Digite um número (ou -1 para sair):");
            int numero = scanner.nextInt();

            if (numero == -1) break;

            total++;
            if (numero % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Total de números digitados: " + total);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        scanner.close();
    }
}
