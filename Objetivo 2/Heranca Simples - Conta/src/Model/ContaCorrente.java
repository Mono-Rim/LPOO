package Model;

public class ContaCorrente extends Conta{
    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + getSaldo() +
                '}';
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
}
