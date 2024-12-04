import java.util.Scanner;
public class questao2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);

        System.out.printf("A temperatura em graus Celsius é: %.2f°C\n", celsius);

        scanner.close();
    }
}
