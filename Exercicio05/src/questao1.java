import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade de " + nome + ":");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println(nome + " é menor.");
        } else {
            System.out.println(nome + " é maior de idade.");
        }
        scanner.close();
    }
}