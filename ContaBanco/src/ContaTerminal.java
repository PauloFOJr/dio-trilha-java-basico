import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o local da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "agência é em \n"  + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo +
                " já está disponível para saque.");
    }
}
