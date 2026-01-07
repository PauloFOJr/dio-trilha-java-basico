public class Quadrado implements CalculadoraArea{
    private double lado;


    public Quadrado(double lado) {
        this.lado = lado;

    }

    @Override
    public void areaGeometrica() {
        double area = lado * lado;
        System.out.println("A área do quadrado é: "+ area);
        System.out.println("================================");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
