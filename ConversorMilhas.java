import java.util.Scanner;

public class ConversorMilhas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a distância em milhas: ");
    double milhas = scanner.nextDouble();

    double quilometros = milhas * 1.609;

    System.out.printf("A distância em quilômetros é: %.2f km%n", quilometros);
  }
}