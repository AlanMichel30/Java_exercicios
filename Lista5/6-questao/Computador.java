public class Computador extends Eletronico {
    private String processador;
    private String memoria;
    private String ssd;

    public Computador(String marca, String modelo, double preco, String descricao, String processador, String memoria, String ssd) {
        super(marca, modelo, preco, descricao);
        this.processador = processador;
        this.memoria = memoria;
        this.ssd = ssd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoria='" + memoria + '\'' +
                ", ssd='" + ssd + '\'' +
                ", " + super.toString() +
                '}';
    }
}
