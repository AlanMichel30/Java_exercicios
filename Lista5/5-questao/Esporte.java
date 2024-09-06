public abstract class Esporte {
    private String nome;
    private int numero_de_jogadores;
    private double tempo_de_jogo;

    public Esporte(String nome, int numero_de_jogadores, double tempo_de_jogo) {
        this.nome = nome;
        this.numero_de_jogadores = numero_de_jogadores;
        this.tempo_de_jogo = tempo_de_jogo;
    }

    public Esporte(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero_de_jogadores() {
        return numero_de_jogadores;
    }

    public void setNumero_de_jogadores(int numero_de_jogadores) {
        this.numero_de_jogadores = numero_de_jogadores;
    }

    public double getTempo_de_jogo() {
        return tempo_de_jogo;
    }

    public void setTempo_de_jogo(double tempo_de_jogo) {
        this.tempo_de_jogo = tempo_de_jogo;
    }

    @Override
    public String toString() {
        return "Esporte{" +
                "nome='" + nome + '\'' +
                ", numero_de_jogadores=" + numero_de_jogadores +
                ", tempo_de_jogo=" + tempo_de_jogo +
                '}';
    }
}
