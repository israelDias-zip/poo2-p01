package org.Model;

public class Endereco {
    private long id;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String referencia;

//Construtores

    public Endereco() {
        this.id = 0;
        this.cep = "";
        this.logradouro = "";
        this.numero = "";
        this.complemento = "";
        this.referencia = "";
    }

    public Endereco(long id, String cep, String logradouro, String numero, String complemento, String referencia) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.referencia = referencia;
    }
//Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
