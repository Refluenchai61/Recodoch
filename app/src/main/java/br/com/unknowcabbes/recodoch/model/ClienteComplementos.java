package br.com.unknowcabbes.recodoch.model;

import java.io.Serializable;

public class ClienteComplementos implements Serializable{
    private Integer id;
    private Integer clienteId;
    private Integer tipoDocumentoId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }
    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getTipoDocumentoId() {
        return tipoDocumentoId;
    }
    public void setTipoDocumentoId(Integer tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
    }
}
