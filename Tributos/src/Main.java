public class Main {
    public static void main(String[] args) {
    Tributacao cultura = new Cultura();
    cultura.tributo(100);
    Tributacao alimentacao = new Alimentacao();
    alimentacao.tributo(100);
    Tributacao vestuario = new Vestuario();
    vestuario.tributo(100);
    Tributacao sbe = new SaudeEBemEstar();
    sbe.tributo(100);

    }
}