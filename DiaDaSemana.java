import java.util.Scanner;

public class DiaDaSemana {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] diasDaSemana = {"", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

    System.out.print("Digite um número de 1 a 7: ");
    int numero = scanner.nextInt();

    if (numero >= 1 && numero <= 7) {
      System.out.println("O dia da semana correspondente é: " + diasDaSemana[numero]);
    } else {
      System.out.println("Número inválido. Por favor, digite um número de 1 a 7.");
    }
  }
}