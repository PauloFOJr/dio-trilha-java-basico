import java.sql.SQLOutput;
import java.util.ArrayList;

public class Gerente extends Usuario{

    public Gerente(String nome, String email, String senha) {
super(nome, email, senha,true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("===RELATÓRIO FINANCEIRO===");
        System.out.println("Total de vendas:" + Vendedor.getVendas());
        System.out.println("Total de pagamentos:" + Atendente.getPagamento());
    }

    public void consultarVendas() {
        System.out.println(Vendedor.getVendas() + " vendas realizadas.");
    }

}
