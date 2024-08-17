import java.util.Scanner;

public class CalculaAreaCirculo {
  public static final double PI = 3.14159; // valor aproximado de PI

  public static double calculaArea(double raio) {
    return Math.round(PI * Math.pow(raio, 2));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o raio do círculo: ");
    double raio = scanner.nextDouble();

    double area = calculaArea(raio);

    System.out.println("A área do círculo é: " + area);
  }
}