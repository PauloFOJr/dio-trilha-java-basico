public class Inteiro extends Ingresso{

    public Inteiro(double valor, String nomeDoFilme, String tipoDeAudio, int quantidadeDeIngressos) {
        super(valor, nomeDoFilme, tipoDeAudio, quantidadeDeIngressos);
    }

    @Override
    public void valorTotalIngressos() {
        double valorTotal;
        valorTotal = quantidadeDeIngressos * valor;
        System.out.println("O valor dos ingressos é: R$" + valorTotal);
    }

    @Override
    public String toString() {
        return "Inteiro{" +
                "nomeDoFilme='" + nomeDoFilme + '\'' +
                ", tipoDeAudio='" + tipoDeAudio + '\'' +
                '}';
    }
}
