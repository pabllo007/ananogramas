package anagramas.service.patternes.adapter.mensagem;

public class Notificar {
    private final Mensageiro mensageiro;

    public Notificar(Mensageiro mensageiro) {
        this.mensageiro = mensageiro;
    }

    public void notificar(String destinatario, String assunto, String mensagem) {
        mensageiro.enviar(destinatario, assunto, mensagem);
    }
}
