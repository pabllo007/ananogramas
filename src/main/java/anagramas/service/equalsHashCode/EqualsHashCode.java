package anagramas.service.equalsHashCode;

import java.util.Objects;

public class EqualsHashCode {

    private String contrato;
    private String descricao;

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsHashCode that = (EqualsHashCode) o;
        return Objects.equals(contrato, that.contrato) && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contrato, descricao);
    }
}
