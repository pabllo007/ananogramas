package anagramas.service.patternes.adapter.mensagem;

public class SendGridClientService {
    public void enviarEmail(String destinatario, String assunto, String corpoEmail, String remente) {
        //logica para implemetar a biblioteca de terceiro
        System.out.println("destinatario: " + destinatario);
        System.out.println("assunto: " + assunto);
        System.out.println("corpoEmail: " + corpoEmail);
        System.out.println("remente: " + remente);
    }
}
