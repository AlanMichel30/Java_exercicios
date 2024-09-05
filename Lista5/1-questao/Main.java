public class Main {
    public static void main(String[] args) {

        Forma circulo = new Circulo(5);
        System.out.printf("Círculo - Área: %.2f, Perímetro: %.2f%n", circulo.calcularArea(), circulo.calcularPerimetro());

        Forma retangulo = new Retangulo(4, 7);
        System.out.printf("Retângulo - Área: %.2f, Perímetro: %.2f%n", retangulo.calcularArea(), retangulo.calcularPerimetro());

        Forma triangulo = new Triangulo(3, 4, 5, 6);
        System.out.printf("Triângulo - Área: %.2f, Perímetro: %.2f%n", triangulo.calcularArea(), triangulo.calcularPerimetro());
    }
}