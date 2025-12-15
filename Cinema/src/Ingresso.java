public abstract class Ingresso {
    protected double valor;
    protected String nomeDoFilme;
    protected String tipoDeAudio;
    protected int quantidadeDeIngressos;

    public Ingresso(double valor, String nomeDoFilme, String tipoDeAudio, int quantidadeDeIngressos) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.tipoDeAudio = tipoDeAudio;
        this.quantidadeDeIngressos = quantidadeDeIngressos;
    }

    public abstract void valorTotalIngressos();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getTipoDeAudio() {
        return tipoDeAudio;
    }

    public void setTipoDeAudio(String tipoDeAudio) {
        this.tipoDeAudio = tipoDeAudio;
    }

    public int getQuantidadeDeIngressos() {
        return quantidadeDeIngressos;
    }

    public void setQuantidadeDeIngressos(int quantidadeDeIngressos) {
        this.quantidadeDeIngressos = quantidadeDeIngressos;
    }
}
