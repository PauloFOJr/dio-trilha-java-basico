public class Retangulo implements CalculadoraArea{
   private double base;
   private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void areaGeometrica() {
        double area = base * altura;
        System.out.println("A área do retângulo é: "+ area);
        System.out.println("================================");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
