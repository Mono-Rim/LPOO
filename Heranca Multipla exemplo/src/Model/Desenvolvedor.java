package Model;

public class Desenvolvedor extends Funcionario{
    @Override
    public double getBonus() {
        return this.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\n Desenvolvedor {getBonus=" + getBonus() + ", getNome=" + getNome() + ", getSalario=" + getSalario() +
                '}';
    }
}
