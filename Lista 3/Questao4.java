import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();

        System.out.print("Digite o número de vezes para repetir nome: ");
        int vez = s.nextInt();

        for (int i = 1; i <= vez; i++) {
            System.out.printf("Nome:%s%n", nome);
        }
    }
}