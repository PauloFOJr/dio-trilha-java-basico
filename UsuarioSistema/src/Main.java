public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", "paulo@email", "123");
        Vendedor vendedor = new Vendedor("Elemar", "elemar@email", "456");
        Atendente atendente = new Atendente("Daniel", "daniel@email", "789");

        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        atendente.receberPagamentos(50);
        atendente.receberPagamentos(150);
        atendente.receberPagamentos(250);
        atendente.fecharCaixa();
        gerente.gerarRelatorioFinanceiro();

    }
}