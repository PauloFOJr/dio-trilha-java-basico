package PetShop;

public class PetMachine {
    private double agua;
    private double shampoo;
    private Pet pet;
    private boolean maquina;



    public PetMachine(Pet pet) {
        this.agua = 30;
        this.shampoo = 10;
        this.pet = pet;
    }

    public void darBanho() {
        verificarNivelAgua();
        verificarNivelShampoo();
        inserirPetNaMaquina();
        retirarPetDaMaquina();
        limparMaquina();
    }

    public void abastecerAgua() {
        if (this.agua < 30) {
            do this.agua++;
            while (this.agua == 30);
        }

    }

    public void abastecerShampoo() {
        if (this.shampoo < 10) {
            do this.shampoo++;
            while (this.shampoo == 10);
        }
    }

    public void verificarNivelAgua() {
        if (this.agua < 30) {
            abastecerAgua();
            System.out.println("Abastecendo de água");
        } else {
            System.out.println("Abastecido");
        }
    }

    public void verificarNivelShampoo() {
        if (this.agua < 10) {
            abastecerShampoo();
            System.out.println("Abastecendo de shampoo");
        } else {
            System.out.println("Abastecido");
        }
    }

    public void inserirPetNaMaquina() {

        if () {

        }

    }

    public void retirarPetDaMaquina() {

    }

    public void limparMaquina() {
        if (true) {
            this.agua = this.agua - 3;
            this.shampoo = this.shampoo - 1;
            System.out.println("Máquina limpa.");
        } else
            System.out.println("Máquina necessita de limpeza");
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getShampoo() {
        return shampoo;
    }

    public void setShampoo(double shampoo) {
        this.shampoo = shampoo;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public boolean getMaquina() {
        return maquina;
    }

    public void setMaquina(boolean maquina) {
        this.maquina = maquina;
    }
}

