import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, menor160 = 0, entre160e180 = 0, maior180 = 0;

        while (true) {
            System.out.println("Digite a altura da pessoa em metros (ou -1 para sair):");
            double altura = scanner.nextDouble();

            if (altura == -1) break;

            total++;
            if (altura < 1.60) menor160++;
            else if (altura <= 1.80) entre160e180++;
            else maior180++;
        }

        System.out.println("Total de pessoas cadastradas: " + total);
        System.out.println("Altura menor que 1,60 m: " + menor160);
        System.out.println("Altura entre 1,60 m e 1,80 m: " + entre160e180);
        System.out.println("Altura maior que 1,80 m: " + maior180);
        scanner.close();
    }
}
