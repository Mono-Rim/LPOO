package Controller;

import Model.Cliente;
import Model.Desenvolvedor;
import Model.Gerente;

public class FuncionarioController {
    public static void main(String[] args) {

        Desenvolvedor d1 = new Desenvolvedor();
        Gerente g1 = new Gerente();
        Cliente c1 = new Cliente();

        d1.setSalario(1000);
        d1.setNome("Rafael");
        System.out.println(d1);

        g1.setSalario(2000);
        g1.setNome("Ana");
        g1.setTicker("TOTS3");
        g1.setQuantidade(1000);
        System.out.println(g1);

        c1.setId(1);
        c1.setNome("Aline");
        c1.setSobrenome("Santos");
        c1.setTicker("TOTS3");
        c1.setQuantidade(1000);
        System.out.println(c1);



    }
}
