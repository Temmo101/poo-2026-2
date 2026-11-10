public class DemoTipos {
    public static void main(String[] args) {
        Moto moto = new Moto("XYZ9K87", "Urbana");
        Veiculo geral = moto;
        System.out.println(geral == moto);
        System.out.println(moto.getTarifaHora());
        System.out.println(geral.getTarifaHora());
        geral.alterarModelo("Compacta");
        System.out.println(moto.getModelo());
    }
}

