public class Main {
    public static void main(String[] args) {
        MensagemAutomatica sms = new SMS();
        enviandoMensagem(sms);
        System.out.println("========================");
        MensagemAutomatica email = new Email();
        enviandoMensagem(email);
        System.out.println("========================");
        MensagemAutomatica rs = new RedesSociais();
        enviandoMensagem(rs);
        System.out.println("========================");
        MensagemAutomatica wp = new Whatsapp();
        enviandoMensagem(wp);


    }

    public static void enviandoMensagem (MensagemAutomatica mensagemAutomatica) {
        mensagemAutomatica.enviarMensagem();
    }
}