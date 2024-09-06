public class Futebol extends Esporte{
    private String time;

    private int anos;
    private String Nascimento;

    public Futebol(String nome, int numero_de_jogadores, double tempo_de_jogo, String time, int anos, String nascimento) {
        super(nome, numero_de_jogadores, tempo_de_jogo);
        this.time = time;
        this.anos = anos;
        Nascimento = nascimento;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    @Override
    public String toString() {
        return "Futebol{" +
                "time='" + time + '\'' +
                ", anos=" + anos +
                ", Nascimento='" + Nascimento + '\'' +
                super.toString()+
                '}';
    }
}
