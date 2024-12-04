import java.util.Scanner;

public class questao7 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite três números diferentes:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();

	        int maior = num1;
	        if (num2 > maior) maior = num2;
	        if (num3 > maior) maior = num3;

	        System.out.println("O maior número é: " + maior);
	        scanner.close();
	    }
}
