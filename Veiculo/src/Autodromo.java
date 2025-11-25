public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("55948889");

        Moto z400 = new Moto();
        z400.setChassi("45564546");
        z400.ligar();
    }
}