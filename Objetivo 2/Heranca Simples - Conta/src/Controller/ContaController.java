package Controller;

import Model.ContaConjunta;
import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.ContaPoupancaSalario;

public class ContaController {
    public static void main(String[] args) {
    ContaCorrente cc1 = new ContaCorrente();
    ContaPoupanca cp1 = new ContaPoupanca();
    ContaConjunta cj1 = new ContaConjunta();
    ContaPoupancaSalario cps1 = new ContaPoupancaSalario();

    cc1.deposita(2000.00);
    //System.out.println(cc1.getSaldo());
    cp1.deposita(1000.00);
    //System.out.println(cp1.getSaldo());
    cj1.deposita(2600.00);
    cps1.deposita(900.00);
        System.out.println(cc1.toString());
        System.out.println(cp1.toString());
        System.out.println(cj1.toString());
        System.out.println(cps1.toString());

    cc1.saca(100);
    System.out.println(cc1.toString());
    cc1.atualiza(10);
    System.out.println(cc1.toString());
    }
}

