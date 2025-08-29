package org.Model;


import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private long id;
    private String nome;
    private float valorLocacao;
    private List<Modelo> listaModelos;

//Construtores
    public Categoria() {
        this.id = 0;
        this.nome = "";
        this.valorLocacao = 0;
        this.listaModelos = new ArrayList<Modelo>();
    }

    public Categoria(long id, String nome, float valorLocacao, List<Modelo> listaModelos) {
        this.id = id;
        this.nome = nome;
        this.valorLocacao = valorLocacao;
        this.listaModelos = listaModelos;
    }

//Getters e Setters
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

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<Modelo> getListaModelos() {
        return listaModelos;
    }

    public void setListaModelos(List<Modelo> listaModelos) {
        this.listaModelos = listaModelos;
    }
}
