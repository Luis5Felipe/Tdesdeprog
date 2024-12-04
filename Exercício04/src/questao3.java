import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da turma:");
        int codigoTurma = scanner.nextInt();

        System.out.println("Digite a quantidade de alunos do sexo masculino:");
        int qtdMasculino = scanner.nextInt();

        System.out.println("Digite a quantidade de alunos do sexo feminino:");
        int qtdFeminino = scanner.nextInt();

        System.out.println("Digite a quantidade de alunos aprovados:");
        int qtdAprovados = scanner.nextInt();

        int totalAlunos = qtdMasculino + qtdFeminino;
        int qtdReprovados = totalAlunos - qtdAprovados;

        double percMasculino = ((double) qtdMasculino / totalAlunos) * 100;
        double percFeminino = ((double) qtdFeminino / totalAlunos) * 100;
        double percReprovados = ((double) qtdReprovados / totalAlunos) * 100;

        System.out.println("\n--- Resultados da Turma ---");
        System.out.println("Código da turma: " + codigoTurma);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.printf("Porcentagem de alunos do sexo masculino: %.2f%%\n", percMasculino);
        System.out.printf("Porcentagem de alunos do sexo feminino: %.2f%%\n", percFeminino);
        System.out.printf("Porcentagem de alunos reprovados: %.2f%%\n", percReprovados);

        scanner.close();
    }
}
