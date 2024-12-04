import java.util.Scanner;

public class questao9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                System.out.println("Triângulo equilátero.");
            } else if (x == y || x == z || y == z) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }
        scanner.close();
    }
}
