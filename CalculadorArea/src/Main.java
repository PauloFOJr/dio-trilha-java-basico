public class Main {
    public static void main(String[] args) {
    CalculadoraArea quadrado = new Quadrado(10);
    quadrado.areaGeometrica();
    CalculadoraArea circulo = new Circulo(5);
    circulo.areaGeometrica();
    CalculadoraArea retangulo = new Retangulo(10,10);
    retangulo.areaGeometrica();
    }
}