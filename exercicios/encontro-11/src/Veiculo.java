import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Veiculo {
    private final String placa;
    private String modelo;
    protected Veiculo(String placa, String modelo) {
        // TODO 11.1: inicialize placa normalizada e modelo
        this.placa = placa.trim().toUpperCase(Locale.ROOT);
        this.modelo = modelo.trim();
    }
    public String getPlaca() {
        // TODO 11.1: devolva a placa deste objeto
        return placa;
    }
    public String getModelo() {
        // TODO 11.1: devolva o modelo deste objeto
        return modelo;
    }
    public boolean alterarModelo(String novo) {
        // TODO 11.1: recuse null ou vazio sem alterar o modelo
        if (novo == null || novo.trim().isEmpty()) {
            return false;
        }

        modelo = novo.trim();
        return true;
    }

    @Override public String toString() {
        // TODO 11.1: devolva somente a descricao comum
        return placa + " | " + modelo; 
    }
}
