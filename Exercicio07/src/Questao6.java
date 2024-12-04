import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativos = 0, positivos = 0, nulos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                nulos++;
            }
        }

        System.out.println("\nQuantidade de números negativos: " + negativos);
        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números nulos: " + nulos);

        scanner.close();
    }
}
