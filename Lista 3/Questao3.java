import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();

        for(int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }
}
