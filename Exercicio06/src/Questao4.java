import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, masculino = 0, feminino = 0;

        while (true) {
            System.out.println("Digite o sexo da pessoa (M/F) ou 'S' para sair:");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (sexo == 'S') break;

            total++;
            if (sexo == 'M') masculino++;
            else if (sexo == 'F') feminino++;
        }

        System.out.println("Total de pessoas cadastradas: " + total);
        System.out.println("Total de homens: " + masculino);
        System.out.println("Total de mulheres: " + feminino);
        scanner.close();
    }
}
