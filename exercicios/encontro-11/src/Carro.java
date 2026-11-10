// TODO 11.2: torne esta classe uma especializacao de Veiculo; elimine estado e regras comuns duplicados.
// TODO 11.3: reaproveite a descricao comum na sobrescrita.
// TODO 11.4: confira independencia de modelo e constante de categoria.
import java.util.Locale;
import java.util.Scanner;

public class Carro extends Veiculo {

    private static final double TARIFA_HORA = 10.0;
    public Carro(String placa, String modelo) { super(placa, modelo); }
    public double getTarifaHora() { return TARIFA_HORA; }
    @Override public String toString() { return "Carro | " + super.toString(); }
}
