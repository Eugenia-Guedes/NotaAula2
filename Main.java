import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo de espera (em minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Digite a tarifa base da corrida (em R$): ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Digite o fator de demanda: ");
        double fatorDemanda = scanner.nextDouble();

        CorridaUber corrida = new CorridaUber(distancia, tempoEspera, tarifaBase, fatorDemanda);

        corrida.exibirDetalhesCorrida();

        scanner.close();

    }
}