package Model;

public class ContaPoupanca extends Conta{


    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void saca(double valor) {
        if(valor>saldo){
            System.out.println("\nErro");
        }else{
            this.saldo -= valor;
        }
    }


    @Override
    public String toString() {
        return "\nContaPoupanca{" +
                "saldo=" + saldo +
                '}';
    }
}
