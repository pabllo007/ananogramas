package anagramas.service.patternes.adapter.mensagem;

public class SendGridAdapter implements Mensageiro {

    private final SendGridClientService sendGridClientService;
    private final String remente;

    public SendGridAdapter(SendGridClientService sendGridClientService, String remente) {
        this.sendGridClientService = sendGridClientService;
        this.remente = remente;
    }

    @Override
    public void enviar(String destinatario, String assunto, String corpo) {
        sendGridClientService.enviarEmail(destinatario, assunto, corpo, remente);

    }
}
