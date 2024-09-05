public class Professor extends Pessoa{
    private String concurso;

    public Professor(String nome, int idade, String endereco, String concurso) {
        super(nome, idade, endereco);
        this.concurso = concurso;
    }


    public String getConcurso() {
        return concurso;
    }

    public void setConcurso(String concurso) {
        this.concurso = concurso;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "concurso='" + concurso + '\'' +
                super.toString()+
                '}';
    }
}