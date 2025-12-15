public class MeiaEntrada extends Ingresso{


    public MeiaEntrada(double valor, String nomeDoFilme, String tipoDeAudio, int quantidadeDeIngressos) {
        super(valor, nomeDoFilme, tipoDeAudio, quantidadeDeIngressos);
    }

    @Override
    public void valorTotalIngressos() {
        double valorTotal;
        valorTotal = (quantidadeDeIngressos * valor) / 2;
        System.out.println("O valor dos ingressos é: R$" + valorTotal);
    }

    @Override
    public String toString() {
        return "MeiaEntrada{" +
                "nomeDoFilme='" + nomeDoFilme + '\'' +
                ", tipoDeAudio='" + tipoDeAudio + '\'' +
                '}';
    }
}
