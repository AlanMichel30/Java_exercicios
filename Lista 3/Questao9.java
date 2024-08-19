import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nomeNovo = "";
        int idadeNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o nome da pessoa " + i + ": ");
            String nome = s.nextLine();
            System.out.print("Qual e a idade: ");
            int idade = s.nextInt();
            s.nextLine();

            if (idade < idadeNova) {
                idadeNova = idade;
                nomeNovo = nome;
            }
        }
        System.out.println("A pessoa mais nova é " + nomeNovo + " com " + idadeNova + " anos.");
    }
}

