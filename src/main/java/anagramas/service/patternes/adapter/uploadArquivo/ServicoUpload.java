package anagramas.service.patternes.adapter.uploadArquivo;

import anagramas.service.patternes.adapter.uploadArquivo.dto.DadosArquivo;

public class ServicoUpload {

    private UploadArquivo uploadArquivo;

    public ServicoUpload(UploadArquivo uploadArquivo){
        this.uploadArquivo = uploadArquivo;
    }

    public void publicarArquivo(DadosArquivo dadosArquivo) {
        this.uploadArquivo.upload(dadosArquivo);
    }
}
