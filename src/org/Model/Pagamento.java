package org.Model;

public class Pagamento {
    private long id;
    private Enum tipoPagamento;
    private float valorTotal;

//Construtores


    public Pagamento() {
        this.id = 0;
        this.tipoPagamento = null;
        this.valorTotal = 0;
    }

    public Pagamento(long id, Enum tipoPagamento, float valorTotal) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
    }

//Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enum getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Enum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
