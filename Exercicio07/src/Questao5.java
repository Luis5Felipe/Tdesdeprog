import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        
        Collections.sort(numeros);
        System.out.println("\nNúmeros na ordem crescente: " + numeros);

        
        Collections.reverse(numeros);
        System.out.println("Números na ordem decrescente: " + numeros);

        scanner.close();
    }
}
