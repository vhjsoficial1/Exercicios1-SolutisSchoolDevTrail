import java.util.Scanner;

public class OrdenarPalavras {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a primeira palavra: ");
    String palavra1 = scanner.next();

    System.out.print("Informe a segunda palavra: ");
    String palavra2 = scanner.next();

    // Ordenar as palavras em ordem alfabética
    if (palavra1.compareTo(palavra2) <= 0) {
      System.out.println("\nPalavras em ordem alfabética:");
      System.out.println(palavra1);
      System.out.println(palavra2);
    } else {
      System.out.println("\nPalavras em ordem alfabética:");
      System.out.println(palavra2);
      System.out.println(palavra1);
    }

    // Verificar qual palavra tem o maior número de caracteres
    int tamanhoPalavra1 = palavra1.length();
    int tamanhoPalavra2 = palavra2.length();

    if (tamanhoPalavra1 > tamanhoPalavra2) {
      System.out.println("\nA palavra '" + palavra1 + "' tem o maior número de caracteres (" + tamanhoPalavra1 + ").");
    } else if (tamanhoPalavra2 > tamanhoPalavra1) {
      System.out.println("\nA palavra '" + palavra2 + "' tem o maior número de caracteres (" + tamanhoPalavra2 + ").");
    } else {
      System.out.println("\nAs palavras têm o mesmo número de caracteres (" + tamanhoPalavra1 + ").");
    }
  }
}
