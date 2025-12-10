package PetShop;

public class Pet{
    private String nome;
    protected boolean petLimpo = false;

    public Pet(String nome, boolean petClean) {
        this.nome = nome;
        this.petLimpo = petClean;
    }

    public Pet(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPetLimpo() {
        return petLimpo;
    }

    public void setPetLimpo(boolean petLimpo) {
        this.petLimpo = petLimpo;
    }
}
