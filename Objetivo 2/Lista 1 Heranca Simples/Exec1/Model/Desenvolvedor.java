package Model;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario, double bonus) {
        super(nome, salario, bonus);
    }

    public Desenvolvedor() {
        super();
    }

    @Override
    public double getBonus() {
        return 5.0;
    }
}
