package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        System.out.println("\n" + funcionario1.toString());


        Funcionario funcionario2 = new Funcionario("Cleiton", 2500.0);

        System.out.println("\n" + funcionario2.toString());


        funcionario1.setNome("Robert");
        funcionario1.setSalario(2500.0);
        funcionario2.setNome("Robson");
        funcionario2.setSalario(3000.0);

        System.out.println();
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());
        System.out.println();
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getSalario());


    }
}
