package br.com.unknowcabbes.recodoch.model;

import java.io.Serializable;

public class Usuario implements Serializable{
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private Integer tipoUsuarioId;
    private Boolean ativo;
    private Integer clienteId;

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

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getTipoUsuarioId() {
        return tipoUsuarioId;
    }
    public void setTipoUsuarioId(Integer tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
    }

    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getClienteId() {
        return clienteId;
    }
    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }
}
