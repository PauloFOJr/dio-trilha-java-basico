package PetShop;

public class PetMachine {
    private double agua = 30;
    private double shampoo = 10;
    private Pet pet;
    private boolean limpo = true;

    public void darBanho() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setPetLimpo(true);
        System.out.println("O pet " + pet.getNome() + " está limpo.");
    }

    public void abastecerAgua() {
        if (agua == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        agua += 2;
    }

    public void abastecerShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo += 2;
    }

    public boolean temPet() {
        return  pet != null;
    }

    public void retirarPetDaMaquina() {
        this.limpo = this.pet.isPetLimpo();
        System.out.println("O pet " + this.pet.getNome() + " foi retirado da máquina.");
        this.pet = null;
    }

    public void limparMaquina() {
        this.agua -= 3;
        this.shampoo -= 1;
        this.limpo = true;
        System.out.println("A máquina foi limpa");
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
        if (!this.limpo){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-lá;");
            return;
        }
        if (temPet()) {
            System.out.println("O pet " + this.pet.getNome() + " está na máquina nesse momento.");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getNome() + " foi colocado na máquina.");
    }

    public boolean getLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}

