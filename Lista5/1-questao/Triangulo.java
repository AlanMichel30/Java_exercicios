class Triangulo extends Forma {
    private double a;
    private double b;
    private double c;
    private double altura;

    public Triangulo(double a, double b, double c, double altura) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * a * altura;
    }

    public double calcularPerimetro() {
        return a + b + c;
    }
}