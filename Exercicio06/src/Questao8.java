import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMaisAlto = "";
        double alturaMaisAlta = 0, somaAlturas = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            String nome = scanner.next();
            System.out.println("Digite a altura da pessoa " + i + ":");
            double altura = scanner.nextDouble();

            somaAlturas += altura;
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }
        }

        double alturaMedia = somaAlturas / 10;
        System.out.printf("Altura média do grupo: %.2f m\n", alturaMedia);
        System.out.println("Pessoa mais alta: " + nomeMaisAlto + " com " + alturaMaisAlta + " m");
        scanner.close();
    }
}
