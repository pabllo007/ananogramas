package anagramas.service.patternes.adapter.mensagem;

public class console {

    public static void main(String[] args){
        var mailService = new JavaMailService();
        var emailSender = new JavaMailAdapter(mailService);
        var notificar = new Notificar(emailSender);
        notificar.notificar("teste@mail.com",  "Sem assunto","Mensagem do email");

        var sendGrip = new SendGridClientService();
        var emailSenderGrip = new SendGridAdapter(sendGrip, "    remetente@mail.com");
        var notificarSendGrip = new Notificar(emailSenderGrip);
        notificarSendGrip.notificar("teste@mail.com",  "Sem assunto","Mensagem do email");
    }

}
