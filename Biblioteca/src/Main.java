import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       Livro livro = new Livro("Use a Cabeça Java – 3ª Edição: Guia do Aprendiz Para Programação no Mundo Real ","Kathy Sierra","8550819883");
       Usuario usuario = new Usuario("Alan michel", "123.456.789-10");
       Usuario usuario2 = new Usuario("João Miguel", "123.456.123-11");
       usuario.emprestar(livro);
          System.out.println(livro);
    }

}