import java.util.ArrayList;
import java.util.List;

public class DemoLista {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("ABC1D23", "Hatch"));
        veiculos.add(new Moto("XYZ9K87", "Urbana"));
        for (Veiculo v : veiculos) {
            System.out.println(v.getPlaca()
                + " | tarifa/h " + v.getTarifaHora());
        }
    }
}