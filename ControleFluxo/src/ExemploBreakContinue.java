public class ExemploBreakContinue {
    public static void main(String[] args) {
//        for(int numero = 1; numero <= 5; numero ++){
//            if(numero == 3)
//                break;
//        System.out.println(numero);
//        }
//       aqui imprime 1 e 2 e encerra o laço.

        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                continue;
            System.out.println(numero);
//      aqui imprime 1, 2, 4, 5. quando identifica o 3, ele não imprimi.
        }
    }
}
