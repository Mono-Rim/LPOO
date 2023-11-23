package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Long numero;
    private Date data;
    private double valor;
    private Tipo tipo;
    private Vendedor vendedor;
    private List<Item> itens = new ArrayList<>();

    public boolean manterPedido(int numero){
        return true;
    }

    public boolean manterItem(int codItem){
        return true;
    }

    public Pedido() {
    }

    public Pedido(Long numero, Date data, double valor, Tipo tipo, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.vendedor = vendedor;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "\n\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", vendedor=" + vendedor +
                ", itens=" + itens +
                '}';
    }
}
