package com.exercise.entities;


public class OrderItem {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public OrderItem() {

    }

    public OrderItem(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public double subTotal() {
        return preco * quantidade;
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getProduto().getName() + ", ");
        sb.append(getProduto().getPreco() + ", ");
        sb.append("Quantidade: ");
        sb.append(getQuantidade() + ", ");
        sb.append("Subtotal: " + subTotal());
        return sb.toString();
    }
}
