public class Futebol extends Esporte{
    private String time;
    private int numero_de_camisa;
    private int anos;
    private String Nascimento;

    public Futebol(String nome, int numero_de_jogadores, double tempo_de_jogo, String time, int numero_de_camisa, int anos, String nascimento) {
        super(nome, numero_de_jogadores, tempo_de_jogo);
        this.time = time;
        this.numero_de_camisa = numero_de_camisa;
        this.anos = anos;
        Nascimento = nascimento;
    }

    public Futebol(String time, int numero_de_camisa, int anos, String nascimento) {
        this.time = time;
        this.numero_de_camisa = numero_de_camisa;
        this.anos = anos;
        Nascimento = nascimento;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumero_de_camisa() {
        return numero_de_camisa;
    }

    public void setNumero_de_camisa(int numero_de_camisa) {
        this.numero_de_camisa = numero_de_camisa;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String nascimento) {
        Nascimento = nascimento;
    }
}
