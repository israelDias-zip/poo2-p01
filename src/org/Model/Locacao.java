package org.Model;

import java.util.ArrayList;
import java.util.Date;

public class Locacao {
    private long id;
    private Date dataLocacao;
    private Date dataDevolucao;
    private float valorLocacao;
    // private List<Ocorrencia> listaOcorrencias;
    private Cliente cliente;

//Construtores


    public Locacao() {
        this.id = 0;
        this.dataLocacao = new Date();
        this.dataDevolucao = new Date();
        this.valorLocacao = 0;
        this.cliente = new Cliente();
    }

    public Locacao(long id, Date dataLocacao, Date dataDevolucao, float valorLocacao, Cliente cliente) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        this.cliente = cliente;
    }

//Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
