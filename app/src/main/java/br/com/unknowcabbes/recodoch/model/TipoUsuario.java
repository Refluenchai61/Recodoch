package br.com.unknowcabbes.recodoch.model;

import java.io.Serializable;

public class TipoUsuario implements Serializable {
    private Integer id;
    private String nome;
    private String Descricao;

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

    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
