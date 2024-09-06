public class Volei extends Esporte {
    private String feminino;

    private int pessoas;

    public Volei(String nome, int numero_de_jogadores, double tempo_de_jogo, String feminino, int pessoas) {
        super(nome, numero_de_jogadores, tempo_de_jogo);
        this.feminino = feminino;
        this.pessoas = pessoas;
    }

    public Volei() {
    }

    public String getFeminino() {
        return feminino;
    }

    public void setFeminino(String feminino) {
        this.feminino = feminino;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "Volei{" +
                "feminino='" + feminino + '\'' +
                ", pessoas=" + pessoas +
                super.toString()+
                '}';
    }
}

