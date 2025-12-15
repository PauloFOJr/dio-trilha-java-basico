public class Atendente extends Usuario{
    protected static double pagamento;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void receberPagamentos(double valor) {
        if (valor > 0) {
        pagamento += valor;
            System.out.println("Pagamento recebido.");
        }
    }

    public void fecharCaixa() {
        System.out.println("O valor do fechamento de caixa é de R$" + pagamento);
    }

    public static double getPagamento() {
        return pagamento;
    }

    public static void setPagamento(double pagamento) {
        Atendente.pagamento = pagamento;
    }
}
