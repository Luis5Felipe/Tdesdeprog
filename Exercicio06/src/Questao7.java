import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Digite um número (ou -1 para sair):");
            int numero = scanner.nextInt();

            if (numero == -1) break;

            if (numero > maior) maior = numero;
        }

        System.out.println("O maior número digitado foi: " + maior);
        scanner.close();
    }
}
