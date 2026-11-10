public class DemoHoras {
    public static void main(String[] args) {
        int minutos = 75;
        double fracao = minutos / 60.0;
        double horas = Math.ceil(fracao);
        double tarifa = 10.0;
        double valor = horas * tarifa;
        System.out.println(fracao);
        System.out.println(horas);
        System.out.println(valor);
    }
}