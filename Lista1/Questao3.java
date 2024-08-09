import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Qual seu saldo?");
        double saldo = s.nextDouble();
        double reajuste = (0.01 * saldo) + saldo;
        System.out.printf("Seu Saldo é R$ %.2f", reajuste);

    }
}
