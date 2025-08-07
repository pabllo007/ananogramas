package anagramas.service.patternes.adapter.uploadArquivo;

import anagramas.service.patternes.adapter.uploadArquivo.dto.DadosArquivo;

public class AmazonS3Service {
    public void publicarArquivoNaAWS(DadosArquivo dadosArquivo) {
        //Implementação para publicar o arquivo no S3 da AWS
        System.out.println("Dados do arquivo: " + dadosArquivo.nomeArquivo());
    }
}