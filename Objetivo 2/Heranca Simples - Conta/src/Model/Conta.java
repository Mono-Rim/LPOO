package Model;

    public abstract class Conta {
    protected double saldo;

    public double getSaldo(){
        return saldo;
    }
    public void deposita(double valor){
        this.saldo += valor;
    }
    public void saca(double valor){
        double saldoAtual = this.saldo - valor;
        if(saldoAtual>0){
            this.saldo -= valor;
        }else{
            System.out.println("\nErro");
        }
    }
    public void atualiza(double taxa) {
        if (taxa > 0) {
            this.saldo += this.saldo*taxa/100;
        }else{
            System.out.println("\nErro");
        }
    }




}
