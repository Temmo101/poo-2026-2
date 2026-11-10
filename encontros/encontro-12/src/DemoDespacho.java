public class DemoDespacho {
    public static void main(String[] args) {
        Veiculo atual = new Carro("ABC1D23", "Hatch");
        Veiculo primeiro = atual;
        System.out.println(atual.getTarifaHora());
        atual = new Moto("XYZ9K87", "Urbana");
        System.out.println(atual.getTarifaHora());
        System.out.println(primeiro.getTarifaHora());
        System.out.println(atual == primeiro);
    }
}