public class main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Alan michel", 32, "Avenida Boa Viagem ", "11222", "3ºB");
        Professor professor = new Professor("Vincius", 30, "Rua faz o L", "Técnico");
        Diretor diretor = new Diretor("Anainha", 44, "Rua da cicero dias", "cicero dias");

        System.out.println(aluno);
        System.out.println(professor);
        System.out.println(diretor);

    }
}
