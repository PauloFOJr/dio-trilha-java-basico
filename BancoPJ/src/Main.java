public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(600);
        cb.pagarBoleto(900);
        cb.exibirSaldoEChequeEspecial();
        cb.depositarDinheiro(100);



    }
}