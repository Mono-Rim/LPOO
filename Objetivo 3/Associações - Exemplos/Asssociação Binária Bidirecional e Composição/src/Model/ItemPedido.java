package Model;

public class ItemPedido {

    private  Long id_itemPedido;
    private Integer quantidade;
    private Double totalItem;
    private Boolean situacao;
    //associação com Produto
    private Produto produto;

    public ItemPedido() {
    }
    public ItemPedido(Long id_itemPedido, Integer quantidade, Double totalItem, Boolean situacao, Produto produto) {
        this.id_itemPedido = id_itemPedido;
        this.quantidade = quantidade;
        this.totalItem = totalItem;
        this.situacao = situacao;
        this.produto = produto;
    }

    public Long getId_itemPedido() {
        return id_itemPedido;
    }

    public void setId_itemPedido(Long id_itemPedido) {
        this.id_itemPedido = id_itemPedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Double totalItem) {
        this.totalItem = totalItem;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItemPedido{" +
                "id_itemPedido=" + id_itemPedido +
                ", quantidade=" + quantidade +
                ", totalItem=" + totalItem +
                ", situacao=" + situacao +
                ", produto=" + produto +
                '}';
    }
}
