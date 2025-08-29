package org.Model;

import java.util.Date;

public class Manutencao {
    private long id;
    private String descricao;
    private Date data;
    private float custo;

//Construtores

    public Manutencao() {
        this.id = 0;
        this.descricao = "";
        this.data = new Date();
        this.custo = 0;
    }

    public Manutencao(long id, String descricao, Date data, float custo) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.custo = custo;
    }

//Getters e Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
}
