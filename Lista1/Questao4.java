import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("O IPI usuário: ");
        double IPI = s.nextDouble();

        System.out.println("Digite o código da peça 1: ");
        double valor1 = s.nextDouble();

        System.out.println("Digite quantidade de peças 1");
        double quant1 = s.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        double valor2 = s.nextDouble();

        System.out.println("Digite quantidade de peças 2");
        double quant2 = s.nextDouble();

        double resultdo = (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);

        System.out.print("O Valor ser pago: " + resultdo);

    }
}
