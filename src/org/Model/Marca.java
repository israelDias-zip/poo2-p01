package org.Model;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private long id;
    private String nome;
    private List<Modelo> modelo;

// CONSTRUTORES

    public Marca() {
        this.id = 0;
        this.nome = "";
        this.modelo = new ArrayList<>();
    }

    public Marca(long id, String nome, List<Modelo> modelo) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
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

    public List<Modelo> getModelo() {
        return modelo;
    }

    public void setModelo(List<Modelo> modelo) {
        this.modelo = modelo;
    }
}
