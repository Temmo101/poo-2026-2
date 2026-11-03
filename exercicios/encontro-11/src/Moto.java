// TODO 11.2: torne esta classe uma especializacao de Veiculo; elimine estado e regras comuns duplicados.
// TODO 11.3: reaproveite a descricao comum na sobrescrita.
// TODO 11.4: confira independencia de modelo e constante de categoria.
import java.util.Locale;
import java.util.Scanner;

public class Moto {

    private final String placa;
    private String modelo;

    private static final double TARIFA_HORA = 6.0;
    public Moto(String placa) { this(placa, "Não informado"); }
    public double getTarifaHora() { return TARIFA_HORA; }
    @Override public String toString() { return "Moto | " + placa + " | " + modelo; }
}
