import java.util.Scanner;

public class ContadorComExcecao {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExcecao e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExcecao {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosExcecao("O segundo paramêtro deve ser maior que o primeiro.");
        } else {
            int contagem = parametroDois - parametroUm;
            for (int indice = 1; indice <= contagem; indice++) {
                System.out.println("Imprimindo o número: " + indice);
            }
        }
    }
}