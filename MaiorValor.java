import java.util.Scanner;

public class MaiorValor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    while (continuar) {
      System.out.print("Digite o primeiro valor: ");
      int valor1 = scanner.nextInt();

      System.out.print("Digite o segundo valor: ");
      int valor2 = scanner.nextInt();

      int maiorValor = maior(valor1, valor2);

      System.out.println("O maior valor é: " + maiorValor);

      System.out.print("\nDeseja continuar? (s/n): ");
      String resposta = scanner.next();

      if (resposta.equalsIgnoreCase("n")) {
        continuar = false;
      }
    }
  }

  public static int maior(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
}