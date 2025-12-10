package PetShop;

import java.util.Scanner;

public class Servicos {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verifica água da máquina");
            System.out.println("5 - Verifica shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.darBanho();
                case 2 -> colocarAgua();
                case 3 -> colocarShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> verifiqueSeTemPetNaMaquina();
                case 7 -> coloqueOPetNaMaquina();
                case 8 -> petMachine.retirarPetDaMaquina();
                case 9 -> petMachine.limparMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (true);
    }

    private static void colocarAgua() {
        System.out.println("Tentando colocar agua na máquina");
        petMachine.abastecerAgua();
    }

    private static void colocarShampoo() {
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.abastecerShampoo();
    }

    private static void verificarAgua() {
        var amount = petMachine.getAgua();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de água");
    }

    private static void verificarShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de shampoo");
    }

    private static void verifiqueSeTemPetNaMaquina() {
        var temPet = petMachine.temPet();
        System.out.println(temPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void coloqueOPetNaMaquina() {
        var nome = "";
        while (nome == null || nome.isEmpty()) {
            System.out.println("Informe o nome do pet: ");
            nome = scanner.next();
        }
        var pet = new Pet(nome);
        petMachine.setPet(pet);
//        System.out.println("O pet " + pet.getNome() + " foi colocado na máquina.");
    }
}