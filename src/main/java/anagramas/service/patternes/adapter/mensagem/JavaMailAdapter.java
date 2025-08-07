package anagramas.service.patternes.adapter.mensagem;

public class JavaMailAdapter implements Mensageiro {

    private final JavaMailService javaMailService;

    public JavaMailAdapter(JavaMailService javaMailService) {
        this.javaMailService = javaMailService;
    }

    @Override
    public void enviar(String destinatario, String assunto, String corpo) {
            javaMailService.sendEmail(destinatario, assunto, corpo);
    }
}
