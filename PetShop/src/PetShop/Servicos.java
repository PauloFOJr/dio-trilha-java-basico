package PetShop;

public class Servicos {
    public static void main(String[] args) {
        Pet pet = new Pet("Leia");
//        pet[0] = new Pet;
//        pet[1] = new Pet("Olivia");
//        pet[2] = new Pet("Gringa");
        PetMachine pm = new PetMachine(pet);
        pm.darBanho();



    }
}