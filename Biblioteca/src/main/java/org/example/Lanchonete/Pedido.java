package org.example.Lanchonete;


public class Pedido {
    private Produto[] pedido;
    private Cliente cliente;
    private int entrega;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getEntrega() {
        return entrega;
    }
    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }

    public Produto[] getPedido() {
        return pedido;
    }

    public void setPedido(Produto[] pedido) {
        this.pedido = pedido;
    }
}
