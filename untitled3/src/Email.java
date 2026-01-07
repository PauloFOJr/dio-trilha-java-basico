public class Email implements MensagemAutomatica{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem Email");
    }
}
