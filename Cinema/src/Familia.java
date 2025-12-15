public class Familia extends Ingresso{
    public Familia(double valor, String nomeDoFilme, String tipoDeAudio, int quantidadeDeIngressos) {
        super(valor, nomeDoFilme, tipoDeAudio, quantidadeDeIngressos);
    }

    @Override
    public String toString() {
        return "Familia{" +
                "nomeDoFilme='" + nomeDoFilme + '\'' +
                ", tipoDeAudio='" + tipoDeAudio + '\'' +
                '}';
    }

    @Override
    public void valorTotalIngressos() {
        double valorTotal;
        if (quantidadeDeIngressos > 3) {
            valorTotal = (quantidadeDeIngressos * valor);
            double desconto = valorTotal * 0.05;
            valorTotal -= desconto;
            System.out.println("O valor dos ingressos é: R$" + valorTotal);
        }

    }


}
