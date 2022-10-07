package com.exercise.entities;

import com.exercise.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    private Date momento;
    private OrderStatus status;
    private Cliente cliente;
    private OrderItem pedido;


    private List<OrderItem> itens = new ArrayList<>();

    public Order() {

    }

    public Order(Date momento, OrderStatus status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItens() {
        return itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public OrderItem getPedido() {
        return pedido;
    }

    public void setPedido(OrderItem pedido) {
        this.pedido = pedido;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removerItem(OrderItem item) {
        itens.remove(item);
    }

    public double total() {
        for (OrderItem items : itens) {
            System.out.println(items);
            pedido.subTotal();
        }
        return pedido.subTotal();
    }
}