import java.util.Scanner;

public class questao5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o nome da equipe:");
	        String nomeEquipe = scanner.nextLine();

	        System.out.println("Digite a quantidade de vitórias:");
	        int vitorias = scanner.nextInt();

	        System.out.println("Digite a quantidade de empates:");
	        int empates = scanner.nextInt();

	        System.out.println("Digite a quantidade de derrotas:");
	        int derrotas = scanner.nextInt();

	        int pontosGanhos = (vitorias * 3) + empates;
	        int pontosTotaisPossiveis = (vitorias + empates + derrotas) * 3;
	        int pontosPerdidos = pontosTotaisPossiveis - pontosGanhos;

	        System.out.println("\n--- Resultados da Equipe ---");
	        System.out.println("Equipe: " + nomeEquipe);
	        System.out.println("Pontos ganhos: " + pontosGanhos);
	        System.out.println("Pontos perdidos: " + pontosPerdidos);

	        scanner.close();
	    }
}
