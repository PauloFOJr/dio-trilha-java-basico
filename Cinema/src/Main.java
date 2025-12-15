
public class Main {
    public static void main(String[] args) {
        Ingresso inteiro = new Inteiro(50, "Senhor dos anéis",
                "legendado", 3);
        Ingresso meiaEntrada = new MeiaEntrada(50, "Harry Potter",
                "dublado", 1);
        Ingresso familia = new Familia(50, "Matrix",
                "legendado", 5);

        inteiro.valorTotalIngressos();
        System.out.println(inteiro.toString());
        meiaEntrada.valorTotalIngressos();
        System.out.println(meiaEntrada.toString());
        familia.valorTotalIngressos();
        System.out.println(familia.toString());

    }
}