package Model;

import java.text.NumberFormat;

public class Senior extends Desenvolvedor {

    public Senior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.10;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorSenior [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }



}