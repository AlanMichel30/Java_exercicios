import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maior = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o idade " + i + ": ");
            int idade = s.nextInt();

            if (idade >= 18) {
                maior++;
            }
        }
        System.out.println("A quantidade de pessoas são maior idade: " + maior);
    }
}

