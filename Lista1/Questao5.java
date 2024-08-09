import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Questao5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Digite o salário mínimo: ");
        double salarioMinimo = s.nextDouble();

        System.out.print("Digite seu salário: ");
        double salarioUsuario = s.nextDouble();

        double QtdSalario = salarioUsuario / salarioMinimo;

        System.out.printf("O salario do usuario é %.2f", QtdSalario );


        }
    }
