public class SaudeEBemEstar implements Tributacao{
    private double imposto = 0.015;

    @Override
    public void tributo(double custo) {
         custo*= imposto;
        System.out.println("Saude e Bem Estar: O valor do tributo é R$" + custo);
        System.out.println("===============================================");
    }
}
