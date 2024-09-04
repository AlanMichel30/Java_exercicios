public class Volei extends Esporte{
    private String praia;

    private int pessoas;

    public Volei(String nome, int numero_de_jogadores, double tempo_de_jogo, String praia, int pessoas) {
        super(nome, numero_de_jogadores, tempo_de_jogo);
        this.praia = praia;
        this.pessoas = pessoas;
    }

    public Volei(String praia, int pessoas) {
        this.praia = praia;
        this.pessoas = pessoas;
    }

    public String getPraia() {
        return praia;
    }

    public void setPraia(String praia) {
        this.praia = praia;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
}
