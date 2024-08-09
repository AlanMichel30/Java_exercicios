import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = s.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }
}
