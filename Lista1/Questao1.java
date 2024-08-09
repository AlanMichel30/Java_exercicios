import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade anos: ");
        int anos = s.nextInt();
        System.out.print("Digite sua idade meses: ");
        int mes = s.nextInt();
        System.out.print("Digite sua idade dias: ");
        int dias = s.nextInt();

        int contagem = (anos * 365) + (mes * 31) + dias;
        System.out.print("A idade em dias é " + contagem + " Dias");

    }
}
