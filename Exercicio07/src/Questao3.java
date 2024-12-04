import java.util.HashMap;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> pessoas = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o código da pessoa: ");
            String codigo = scanner.nextLine();

            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o telefone da pessoa: ");
            String telefone = scanner.nextLine();

            pessoas.put(codigo, nome + " - " + telefone);
        }

        while (true) {
            System.out.print("\nDigite o código para consultar (ou 'sair' para encerrar): ");
            String consulta = scanner.nextLine();
            if (consulta.equalsIgnoreCase("sair")) {
                break;
            }

            if (pessoas.containsKey(consulta)) {
                System.out.println("Dados: " + pessoas.get(consulta));
            } else {
                System.out.println("Código não encontrado.");
            }
        }
        scanner.close();
    }
}
