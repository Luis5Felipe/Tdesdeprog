import java.util.ArrayList;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> quadrados = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        for (int numero : numeros) {
            quadrados.add(numero * numero);
        }

        System.out.println("\nQuadrados dos números:");
        for (int quadrado : quadrados) {
            System.out.println(quadrado);
        }

        scanner.close();
    }
}
