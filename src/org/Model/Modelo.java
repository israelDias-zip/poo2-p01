package org.Model;

import java.util.Date;

public class Modelo {
    private long id;
    private String nome;
    private Date dataModelo;
    private int qntModelo;

    public Modelo() {
        this.id = 0;
        this.nome = "";
        this.dataModelo = new Date();
        this.qntModelo = 0;
    }

    public Modelo(long id, String nome, Date dataModelo, int qntModelo) {
        this.id = id;
        this.nome = nome;
        this.dataModelo = dataModelo;
        this.qntModelo = qntModelo;
    }

//GETTERS E SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataModelo() {
        return dataModelo;
    }

    public void setDataModelo(Date dataModelo) {
        this.dataModelo = dataModelo;
    }

    public int getQntModelo() {
        return qntModelo;
    }

    public void setQntModelo(int qntModelo) {
        this.qntModelo = qntModelo;
    }
}
