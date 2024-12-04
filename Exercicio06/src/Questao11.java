import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a massa inicial do material (em gramas):");
        double massa = scanner.nextDouble();
        double tempo = 0;

        while (massa >= 0.5) {
            massa /= 2;
            tempo += 50;
        }

        System.out.printf("Massa final: %.2f g\n", massa);
        System.out.printf("Tempo necessário: %.2f segundos\n", tempo);
        scanner.close();
    }
}
