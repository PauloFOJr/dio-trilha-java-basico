public class Circulo implements CalculadoraArea{
    private double pi = Math.PI;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void areaGeometrica() {
        double area = Math.pow(raio, 2) * pi;
        System.out.println("A área do círculo é: "+ area);
        System.out.println("================================");
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
