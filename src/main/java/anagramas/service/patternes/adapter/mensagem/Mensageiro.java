package anagramas.service.patternes.adapter.mensagem;

public interface Mensageiro {
    void enviar(String destinatario, String assunto, String corpo);
}

