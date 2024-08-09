import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {

        System.out.print("Digite o valor de A: ");
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = s.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = s.nextInt();

        if (A + B < C) {
            System.out.println("A soma de A e B é menor que C.");
        } else {
            System.out.println("A soma de A e B não é menor que C.");
        }

    }
}

