public class Diretor extends Pessoa{
    private String instiucao;

    public Diretor(String nome, int idade, String endereco, String instiucao) {
        super(nome, idade, endereco);
        this.instiucao = instiucao;

    }



    public String getInstiucao() {
        return instiucao;
    }

    public void setInstiucao(String instiucao) {
        this.instiucao = instiucao;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "instiucao='" + instiucao + '\'' +
                super.toString()+
                '}';
    }
}
