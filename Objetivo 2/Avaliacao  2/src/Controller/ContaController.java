package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Junior", 100, 400);
        Cliente cl2 = new Cliente("Jair", 600, 300);
        Cliente cl3 = new Cliente("Adalberto", 600, 600);
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca(2000);
        ContaPoupanca cp3 = new ContaPoupanca(3000);
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente(4000);
        ContaCorrente cc3 = new ContaCorrente(1000);

        List<Conta> contas = new ArrayList<>();
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);

        System.out.println(contas);

        List<Cliente> associados = new ArrayList<>();
        associados.add(cl1);
        associados.add(cl2);
        associados.add(cl3);

        System.out.println(associados);

        cp3.deposita(1000);
        cp3.atualiza(5);
        cp3.saca(50.00);
        System.out.println(cp3);

        cc2.deposita(500);
        cc2.saca(400);
        System.out.println(cc2);



       System.out.println("\nLucros Cl1: " + cl1.lucros(100,400));
       System.out.println("\nLucros Cl2: " + cl2.lucros(600, 300));
       System.out.println("\nLucros Cl3: " + cl3.lucros(600, 600));

        associados.sort(Comparator.comparing(Cliente::getQdeCotas).reversed());
        System.out.println(associados);

       int maiorCota = associados.get(0).getQdeCotas();

       for(Cliente associado : associados){
           if(associado.getQdeCotas() > maiorCota){
               maiorCota = associado.getQdeCotas();
           }
       }

        System.out.println(("\nAssociados com a maior qtd de cota: "));
       for(Cliente associado : associados){
           if(associado.getQdeCotas() == maiorCota){
               System.out.println(associado);
           }
       }

       contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(contas);

        double maiorSaldo = contas.get(0).getSaldo();

        for(Conta conta : contas){
            if(conta.getSaldo()>maiorSaldo){
                maiorSaldo = conta.getSaldo();
            }
        }
        System.out.println("\n Contas com maior saldo: ");

        for(Conta conta : contas){
            if(conta.getSaldo() == maiorSaldo){
                System.out.println(conta);
            }
        }


    }
}