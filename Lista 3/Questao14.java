import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0;
        int cont101 = 0;
        int cont200 = 0;


        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite um número " + i + ": ");
            int num = s.nextInt();

            if (num >= 0 && num <= 100) {
                contador++;
            } else if (num >= 101 && num <= 200) {
                cont101++;
            } else if (num > 200) {
                cont200++;
            }
        }
            System.out.println("Quantidade de números entre 0 e 100: " + contador);
            System.out.println("Quantidade de números entre 101 e 200: " + cont101);
            System.out.println("Quantidade de números maiores que 200: " + cont200);
        }



    }

