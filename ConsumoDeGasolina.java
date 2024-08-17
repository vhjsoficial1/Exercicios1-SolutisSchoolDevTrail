import java.util.Scanner;

public class ConsumoDeGasolina {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int quilometragemTotal = 0;
    int litrosTotal = 0;
    int tanques = 0;

    while (true) {
      System.out.print("Informe a quilometragem dirigida (ou 0 para sair): ");
      int quilometragem = scanner.nextInt();

      if (quilometragem == 0) {
        break;
      }

      System.out.print("Informe a quantidade de litros de gasolina consumidos: ");
      int litros = scanner.nextInt();

      double consumo = (double) quilometragem / litros;
      System.out.printf("Consumo: %.2f km/L%n", consumo);

      quilometragemTotal += quilometragem;
      litrosTotal += litros;
      tanques++;

      System.out.println("Quilometragem combinada: " + quilometragemTotal + " km");
      System.out.println("Litros de combustível consumidos: " + litrosTotal + " L");
      System.out.println();
    }

    if (tanques > 0) {
      double mediaConsumo = (double) quilometragemTotal / litrosTotal;
      System.out.printf("Média de consumo: %.2f km/L%n", mediaConsumo);
    } else {
      System.out.println("Nenhum registro de consumo encontrado.");
    }
  }
}