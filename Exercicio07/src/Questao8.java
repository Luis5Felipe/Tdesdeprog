import java.util.ArrayList;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        int maior = Integer.MIN_VALUE;
        int ocorrencias = 0;
        ArrayList<Integer> posicoes = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            if (numero > maior) {
                maior = numero;
                ocorrencias = 1;
                posicoes.clear();
                posicoes.add(i);
            } else if (numero == maior) {
                ocorrencias++;
                posicoes.add(i);
            }
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Quantidade de vezes que o maior número ocorre: " + ocorrencias);
        System.out.print("Posições em que o maior número aparece: ");
        for (int posicao : posicoes) {
            System.out.print(posicao + " ");
        }

        scanner.close();
    }
}
