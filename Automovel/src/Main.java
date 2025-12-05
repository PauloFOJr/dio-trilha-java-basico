public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.ligarCarro();

//      fusca.acelerarCarro();
      fusca.setVelocidade(40);

       fusca.manobrar(true);
       fusca.setVelocidade(0);
       fusca.manobrar(false);

//        fusca.desligarCarro();
//

//        fusca.desacelerarCarro();
    }
}