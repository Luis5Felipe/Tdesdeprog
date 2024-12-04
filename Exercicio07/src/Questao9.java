import java.util.ArrayList;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        ArrayList<Integer> listaC = new ArrayList<>();

        System.out.println("Digite os 10 números para a lista A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            listaA.add(scanner.nextInt());
        }

        System.out.println("\nDigite os 10 números para a lista B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            listaB.add(scanner.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            listaC.add(listaA.get(i) + listaB.get(i));
        }

        System.out.println("\nConteúdo da lista C (soma dos elementos de A e B):");
        for (int i = 0; i < listaC.size(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + listaC.get(i));
        }

        scanner.close();
    }
}
