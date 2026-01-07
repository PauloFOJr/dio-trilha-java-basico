public class Alimentacao implements Tributacao{
    private double imposto = 0.01;

    @Override
    public void tributo(double custo) {
        custo*= imposto;
        System.out.println("Alimentação: O valor do tributo é R$" + custo);
        System.out.println("===============================================");
    }
}
