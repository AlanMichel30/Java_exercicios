import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i  );

            }
        }
    }

