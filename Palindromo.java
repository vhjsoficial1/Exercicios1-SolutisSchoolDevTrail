import java.util.Scanner;

public class Palindromo {
  public static String verificaPalindromo(String palavra) {
    String palavraReversa = new StringBuilder(palavra).reverse().toString();
    if (palavra.equalsIgnoreCase(palavraReversa)) {
      return "A palavra '" + palavra + "' é um palíndromo!";
    } else {
      return "A palavra '" + palavra + "' não é um palíndromo.";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    while (continuar) {
      System.out.print("Digite uma palavra: ");
      String palavra = scanner.nextLine();
      System.out.println(verificaPalindromo(palavra));

      System.out.print("Deseja continuar? (s/n): ");
      String resposta = scanner.nextLine();

      if (resposta.equalsIgnoreCase("n")) {
        continuar = false;
      }
    }

    scanner.close();
  }
}