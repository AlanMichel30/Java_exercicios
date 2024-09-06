public class Basquete extends Esporte {
    private String time;
    private double altura;
    private int anos;

    public Basquete(String nome, int numero_de_jogadores, double tempo_de_jogo, String time, double altura, int anos) {
        super(nome, numero_de_jogadores, tempo_de_jogo);
        this.time = time;
        this.altura = altura;
        this.anos = anos;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    @Override
    public String toString() {
        return "Basquete{" +
                "time='" + time + '\'' +
                ", altura=" + altura +
                ", anos=" + anos +
                '}';
    }
}


