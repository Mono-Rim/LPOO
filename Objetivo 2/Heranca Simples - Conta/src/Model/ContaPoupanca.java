package Model;

public class ContaPoupanca extends Conta{
    @Override
    public String toString() {
        return "\nContaPoupanca{" +
                "saldo=" + getSaldo() +
                '}';
    }
}
