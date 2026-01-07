public class Cultura implements Tributacao{
    private double imposto = 0.04;

    @Override
    public void tributo(double custo) {
        custo*= imposto;
        System.out.println("Cultura: O valor do tributo é R$$" + custo);
        System.out.println("===============================================");
    }
}
