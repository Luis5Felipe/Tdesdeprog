import java.util.ArrayList;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes.add(scanner.nextLine());

            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            soma += nota;
            scanner.nextLine();
        }

        double media = soma / 10;
        System.out.printf("\nNota média da turma: %.2f%n", media);
        System.out.println("Alunos com notas acima da média:");

        for (int i = 0; i < nomes.size(); i++) {
            if (notas.get(i) > media) {
                System.out.println("Nome: " + nomes.get(i) + ", Nota: " + notas.get(i));
            }
        }
        scanner.close();
    }
}
