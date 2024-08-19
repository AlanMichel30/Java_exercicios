import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int par =0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = s.nextInt();

            if (num % 2 == 0) {
                par++;
            }
        }
            System.out.print("Quantos números são pares é: " + par);
    }
}
