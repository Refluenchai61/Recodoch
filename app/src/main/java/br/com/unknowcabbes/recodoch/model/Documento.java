package br.com.unknowcabbes.recodoch.model;
import java.io.Serializable;

public class Documento implements Serializable {
    private Integer id;
    private Integer registroId;
    private Integer tipoDocumentoId;
    private String informacoes;
    private Integer quantidade;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegistroId() {
        return registroId;
    }
    public void setRegistroId(Integer registroId) {
        this.registroId = registroId;
    }

    public Integer getTipoDocumentoId() {
        return tipoDocumentoId;
    }
    public void setTipoDocumentoId(Integer tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
    }

    public String getInformacoes() {
        return informacoes;
    }
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
