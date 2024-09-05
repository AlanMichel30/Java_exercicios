public class Aluno extends Pessoa{
    private String matricula;
    private String turma;

    public Aluno(String nome, int idade, String endereco, String matricula, String turma) {
        super(nome, idade, endereco);
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", turma='" + turma + '\'' +

                super.toString()+
                '}';
    }
}