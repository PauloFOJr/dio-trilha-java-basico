public class SMS implements MensagemAutomatica{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem SMS");
    }
}
