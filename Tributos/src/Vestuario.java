public class Vestuario implements Tributacao{
   private double imposto = 0.025;

    @Override
    public void tributo(double custo) {
        custo*= imposto;
        System.out.println("Vestuário: O valor do tributo é R$" + custo);
        System.out.println("===============================================");
    }
}
