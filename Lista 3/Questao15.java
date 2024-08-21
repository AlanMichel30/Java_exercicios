import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;

        while (true) {
            System.out.print("Digite um número (ou um número negativo para encerrar): ");
            int numero = s.nextInt();

            if (numero < 0) {
                break;
            }
            soma += numero;
        }
        System.out.println("A soma dos números digitados é: " + soma);
    }
}
