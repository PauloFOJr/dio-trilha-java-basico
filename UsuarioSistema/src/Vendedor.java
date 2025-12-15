public class Vendedor extends Usuario {



    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }


    public void realizarVenda() {
        vendas++;
        System.out.println("Venda concluida.");
    }

    public void consultarVendas() {
        System.out.println(vendas + " vendas realizadas.");
    }



}
