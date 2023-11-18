package Model;

import java.util.Date;

public class Corrida {
    private Long id;
    private String tipoPagamento;
    private String detalhesPagamento;
    private Date dataInicio;
    private double preco;
    Usuario usuario;
    Motorista motorista;

    public Corrida() {
    }

    public Corrida(Long id, String tipoPagamento, String detalhesPagamento, Date dataInicio, double preco, Usuario usuario, Motorista motorista) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.dataInicio = dataInicio;
        this.preco = preco;
        this.usuario = usuario;
        this.motorista = motorista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDetalhesPagamento() {
        return detalhesPagamento;
    }

    public void setDetalhesPagamento(String detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Motorista getmotorista() {
        return motorista;
    }

    public void setmotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\n\nCorrida{" +
                "id=" + id +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", detalhesPagamento='" + detalhesPagamento + '\'' +
                ", dataInicio=" + dataInicio +
                ", preco=" + preco +
                ", usuario=" + usuario +
                ", motorista=" + motorista +
                '}';
    }
}
