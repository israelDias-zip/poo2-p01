package org.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private long id;
    private Date dataContrato;
    private float valorCaucao;
    private Enum Status;
    private List<Locacao> listaLocacao;
    private float valorTotal;
    //private Funcionario funcionario;
    private Cliente cliente;

//Construtores

    public ContratoLocacao() {
        this.id = 0;
        this.dataContrato = new Date();
        this.valorCaucao = 0;
        this.listaLocacao = new ArrayList<>();
        this.Status = null;
        this.valorTotal = 0;
        this.cliente = cliente;

    }

    public ContratoLocacao(long id, Date dataContrato, float valorCaucao, Enum status, List<Locacao> listaLocacao, float valorTotal, Cliente cliente) {
        this.id = id;
        this.dataContrato = dataContrato;
        this.valorCaucao = valorCaucao;
        Status = status;
        this.listaLocacao = listaLocacao;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

//Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public float getValorCaucao() {
        return valorCaucao;
    }

    public void setValorCaucao(float valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public Enum getStatus() {
        return Status;
    }

    public void setStatus(Enum status) {
        Status = status;
    }

    public List<Locacao> getListaLocacao() {
        return listaLocacao;
    }

    public void setListaLocacao(List<Locacao> listaLocacao) {
        this.listaLocacao = listaLocacao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
