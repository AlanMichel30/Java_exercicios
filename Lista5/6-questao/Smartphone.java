public class Smartphone extends Eletronico {
    private int bateria;
    private int camera;

    public Smartphone(String marca, String modelo, double preco, String descricao, int bateria, int camera) {
        super(marca, modelo, preco, descricao);
        this.bateria = bateria;
        this.camera = camera;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "bateria=" + bateria +
                ", camera=" + camera +
                ", " + super.toString() +
                '}';
    }
}
