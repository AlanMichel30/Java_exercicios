import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double soma = 0;
        double media;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = s.nextInt();
            soma += idade;
        }
            media =  soma / 20;
            System.out.printf("%nA média das idades de 20 pessoas é: %.2f", media);
    }
}
