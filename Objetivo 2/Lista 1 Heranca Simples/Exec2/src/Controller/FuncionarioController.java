package Controller;

import Model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

        Gerente g1 = new GerenteGeral("Cleiton", 6500.00);
        Gerente g2 = new GerenteDesenvolvimento("Aldair", 4500.00);
        Desenvolvedor s1 = new Senior("Jerson", 3500.00);
        Desenvolvedor s2 = new Senior("Junior", 3500.00);
        Desenvolvedor s3 = new Senior("Jair", 3500.00);
        Desenvolvedor s4 = new Senior("Alfred", 3500.00);
        Desenvolvedor s5 = new Senior("Arthur", 3500.00);
        Desenvolvedor s6 = new Senior("Fred", 3500.00);
        Desenvolvedor p1 = new Pleno("Jamelao", 2500);
        Desenvolvedor p2 = new Pleno("Luiz", 2500);
        Desenvolvedor p3 = new Pleno("Louise", 2500);
        Desenvolvedor p4 = new Pleno("Lais", 2500);
        Desenvolvedor p5 = new Pleno("Neuza", 2500);
        Desenvolvedor p6 = new Pleno("jeferson", 2500);
        Desenvolvedor j1 = new Junior("Clebao", 1800);
        Desenvolvedor j2 = new Junior("Jadir", 1800);
        Desenvolvedor j3 = new Junior("Otavio", 1800);
        Desenvolvedor j4 = new Junior("Maria", 1800);
        Desenvolvedor j5 = new Junior("Joao", 1800);
        Desenvolvedor j6 = new Junior("Pedro", 1800);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(s1);
        funcionarios.add(s2);
        funcionarios.add(s3);
        funcionarios.add(s4);
        funcionarios.add(s5);
        funcionarios.add(s6);
        funcionarios.add(p1);
        funcionarios.add(p2);
        funcionarios.add(p3);
        funcionarios.add(p4);
        funcionarios.add(p5);
        funcionarios.add(p6);
        funcionarios.add(j1);
        funcionarios.add(j2);
        funcionarios.add(j3);
        funcionarios.add(j4);
        funcionarios.add(j5);
        funcionarios.add(j6);

        System.out.println("Funcionarios da empresa:\n" + funcionarios);

        double totalComBonus = 0.0;
        for(Funcionario funcionario : funcionarios){
            totalComBonus += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("\n\n Total com bonus é:");
        System.out.println(NumberFormat.getCurrencyInstance().format(totalComBonus));

        double totalSemBonus = 0.0;
        for (Funcionario funcionario : funcionarios){
            totalSemBonus += funcionario.getSalario();
        }
        System.out.println("\n Total sem bonus é:");
        System.out.println(NumberFormat.getCurrencyInstance().format(totalSemBonus)+ "\n");


        //bonus de 5%
        totalComBonus = 0.0;
        for(Funcionario funcionario : funcionarios){
            funcionario.setSalario(funcionario.getSalario() + (funcionario.getSalario() * 0.05));
            totalComBonus += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("Total com novo bonus-1:\n"+NumberFormat.getCurrencyInstance().format(totalComBonus));

        System.out.println("\nTotal com novo bonus-2:\n" +
                NumberFormat.getCurrencyInstance().format(
                        funcionarios.stream()
                                .mapToDouble(f -> {
                                    f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
                                    return f.getSalario() + f.getBonus();
                                }).sum()
                )
        );

        //nao entendi por que ficou diferente, entao coloquei os dois
    }
}
