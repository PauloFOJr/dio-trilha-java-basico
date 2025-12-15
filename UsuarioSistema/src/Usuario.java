public class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;
    protected static int vendas;

    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
        vendas = 0;
    }

    public void realizarLogin() {
        System.out.println("Realizando login");
    }

    public void realizarLogoff() {
        System.out.println("Realizando logoff");
    }

    public void alterarDados() {
        System.out.println("Alterando dados");
    }

    public void alterarSenha() {
        System.out.println("Alterando senha");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public static int getVendas() {
        return vendas;
    }

    public static void setVendas(int vendas) {
        Usuario.vendas = vendas;
    }
}
