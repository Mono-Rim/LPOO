package Controller;

import Model.Empresa;
import Model.Funcionario;

import javax.xml.stream.events.EntityReference;
import java.util.Comparator;
import java.util.Date;

public class EmpresaController {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(
                1L, "5435", "Carlos", "Nunes", new Date(2004,12,1)
        );
        Funcionario f2 = new Funcionario(
                2L, "6546654", "Gabriel", "Netto", new Date(1990,12,1)
        );
        Funcionario f3 = new Funcionario(
                3L, "547654735", "Pedro", "Ferraz", new Date(2000,12,1)
        );
        Funcionario f4 = new Funcionario(
                4L, "765756", "Robert", "Silva", new Date(2007,12,1)
        );
        Funcionario f5 = new Funcionario(
                5L, "5453476", "Junior", "Freitas", new Date(2002,12,1)
        );
        Funcionario f6 = new Funcionario(
                6L, "987966", "Anderson", "Souza", new Date(2003,12,1)
        );

        Empresa e1 = new Empresa(
                "584375", "engenharia", "CMT"
        );
        Empresa e2 = new Empresa(
                "76587568", "informatica", "CTYR"
        );

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);
        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        System.out.println("Funcionarios empresa 1:\n");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1.getFuncionarios());
        System.out.println("Funcionarios empresa 2:\n");
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e2.getFuncionarios());

        System.out.println("Funcionarios empresa 1:\n");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e1.getFuncionarios());
        System.out.println("Funcionarios empresa 2:\n");
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e2.getFuncionarios());



    }
}
