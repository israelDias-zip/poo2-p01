package org.Model;

public class Cliente {
    private long id;
    private String cnh;

//Construtores

    public Cliente() {
        this.id = 0;
        this.cnh = "";
    }

    public Cliente(long id, String cnh) {
        this.id = id;
        this.cnh = cnh;
    }

//Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
