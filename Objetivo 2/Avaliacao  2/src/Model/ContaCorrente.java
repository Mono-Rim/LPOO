package Model;

public class ContaCorrente extends Conta implements Associado{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return 0;
    }

    @Override
    public void saca(double valor) {
        double saldoAtual = this.saldo - valor;
        if(saldoAtual>=-200){
            this.saldo -= valor;
        }else{
            System.out.println("\nErro");
        }
    }


    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
