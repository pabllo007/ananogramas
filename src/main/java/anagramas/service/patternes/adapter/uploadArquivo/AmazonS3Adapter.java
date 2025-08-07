package anagramas.service.patternes.adapter.uploadArquivo;

import anagramas.service.patternes.adapter.uploadArquivo.dto.DadosArquivo;

public class AmazonS3Adapter implements UploadArquivo {

    private final AmazonS3Service amazonS3Service;

    public AmazonS3Adapter(AmazonS3Service amazonS3Service) {
        this.amazonS3Service = amazonS3Service;
    }
    @Override
    public void upload(DadosArquivo dadosArquivo) {
        this.amazonS3Service.publicarArquivoNaAWS(dadosArquivo);
    }
}
