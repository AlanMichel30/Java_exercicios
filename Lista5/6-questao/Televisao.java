public class Televisao extends Eletronico {
    private int tamanhoTela;
    private String resolucao;

    public Televisao(String marca, String modelo, double preco, String descricao, int tamanhoTela, String resolucao) {
        super(marca, modelo, preco, descricao);
        this.tamanhoTela = tamanhoTela;
        this.resolucao = resolucao;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "tamanhoTela=" + tamanhoTela +
                ", resolucao='" + resolucao + '\'' +
                ", " + super.toString() +
                '}';
    }
}
