package Controller;

import Model.Desenvolvedor;
import Model.Funcionario;
import Model.Gerente;

public class FuncionarioController {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        Desenvolvedor d1 = new Desenvolvedor();

        d1.setNome("Robson");
        d1.setSalario(2000.00);
        System.out.println(d1.toString());
        System.out.println(g1.toString());
        d1.setSalario(1500.00);
        g1.setSalario(2500.00);
        System.out.println(d1.toString());
        System.out.println(g1.toString());

        //1) Não foi possivel criar instancias da classe funcionario, pois ela é abstrata
        //2) Na classe Gerente e Desenvolvedor, pois é diferente em cada caso, entao vamos sobreescrever o código
        // na classe gerente e funcionario





    }
}
