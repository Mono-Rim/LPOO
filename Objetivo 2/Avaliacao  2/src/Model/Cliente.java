package Model;

public class Cliente implements Associado {

    private String nome = "Cleber";
    private int qdeCotas=0;
    private double valorCota=0;

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    public Cliente() {

    }

    public Cliente(String nome, int qdeCotas, double valorCota) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas*valorCota;
    }


    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + " qdecotas:" + qdeCotas + " valor-da-cota="
                + valorCota +
                '}';
    }


}
