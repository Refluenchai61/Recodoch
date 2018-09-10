package br.com.unknowcabbes.recodoch.model;
import java.io.Serializable;

public class Imagem implements Serializable {
    private Integer id;
    private String nome;
    private String endereco;
    private Integer documentoId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereco;
    }
    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public Integer getDocumentoId() {
        return documentoId;
    }
    public void setDocumentoId(Integer documentoId) {
        this.documentoId = documentoId;
    }
}
