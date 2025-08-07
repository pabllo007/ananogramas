package anagramas.service.patternes.adapter.uploadArquivo;

import anagramas.service.patternes.adapter.uploadArquivo.dto.DadosArquivo;

public class Console {

    public static void main(String[] args){

        var service = new AmazonS3Service();
        var amazonS3 = new  AmazonS3Adapter(service);
        var servicoUpload = new ServicoUpload(amazonS3);
        servicoUpload.publicarArquivo(new DadosArquivo("teste", "arquivo"));

    }
}
