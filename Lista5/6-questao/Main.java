public class Main {
    public static void main(String[] args) {

        Computador computador = new Computador("Samsung", "Galaxy Book", 5000.00, "Notebook com tela de 15 polegadas", "Intel core i5", "RAM 8GB", "1TB");
        Televisao televisao = new Televisao("Samsung Smart TV", "UN58CU7700GXZD", 3000.00, "Smart TV Samsung 58° UHD 4K 58CU7700 2023 Processador Crystal 4K | Gaming Hub Tela sem Limites", 58, "UHD 4K");
        Smartphone smartphone = new Smartphone("Apple", "iPhone 13", 3000.00, "O iPhone 13 tem uma tela superbrilhante projetada para ser resistente. Faz vídeos com qualidade de cinema. Seu chip tem uma velocidade impressionante. E ganhou um aumento notável em bateria", 10, 12);

        System.out.println(computador);
        System.out.println(televisao);
        System.out.println(smartphone);
    }
}
