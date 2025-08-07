package anagramas.service.patternes.adapter.mensagem;

public class JavaMailService {

    public void sendEmail(String destinatario, String assunto, String corpoEmail) {
        //logica para implemetar a biblioteca de terceiro
        System.out.println("destinatario: " + destinatario);
        System.out.println("assunto: " + assunto);
        System.out.println("corpoEmail: " + corpoEmail);
    }
}
