package model;
public class Conta {
    private double saldo;

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void deposita(double valor){

    }
    public void saca(double valor){

    }
    public void atualiza(double valor){

    }

}
