import java.util.Scanner;

public class ContadorDeCaracteres {
  public static void contarCaracteres(String texto) {
    int vogais = 0;
    int espacos = 0;
    int consoantes = 0;

    for (char c : texto.toLowerCase().toCharArray()) {
      if (c == ' ') {
        espacos++;
      } else if ("aeiou".indexOf(c) != -1) {
        vogais++;
      } else if (Character.isLetter(c)) {
        consoantes++;
      }
    }

    System.out.println("Vogais: " + vogais);
    System.out.println("Espaços em branco: " + espacos);
    System.out.println("Consoantes: " + consoantes);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe uma cadeia de caracteres: ");
    String texto = scanner.nextLine();

    contarCaracteres(texto);
  }
}
