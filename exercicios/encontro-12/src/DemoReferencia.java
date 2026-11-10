public class DemoReferencia {
    public static void main(String[] args) {
        Veiculo veiculo = new Moto("XYZ9K87", "Urbana");
        System.out.println(veiculo.getPlaca());
        System.out.println(veiculo.getTarifaHora());
        System.out.println(veiculo);
    }
}

