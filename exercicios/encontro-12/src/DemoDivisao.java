public class DemoDivisao {
    public static void main(String[] args) {
        int minutos = 75;
        double fracaoPerdida = minutos / 60;
        double fracaoPreservada = minutos / 60.0;
        System.out.println(fracaoPerdida);
        System.out.println(Math.ceil(fracaoPerdida));
        System.out.println(fracaoPreservada);
        System.out.println(Math.ceil(fracaoPreservada));
    }
}

