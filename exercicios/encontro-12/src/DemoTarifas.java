public class DemoTarifas {
    static void mostrar(Veiculo v, int minutos) {
        System.out.println(v.getPlaca() + " | " + minutos
            + " min | R$ " + v.calcularTarifa(minutos));
    }
    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC1D23", "Hatch");
        Veiculo moto = new Moto("XYZ9K87", "Urbana");
        mostrar(carro, 75);
        mostrar(moto, 20);
    }
}