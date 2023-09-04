package controller;

import model.Conta;
public class ContaController {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setSaldo(100.0);
        System.out.println(conta1.toString());

        Conta conta2 = new Conta();
        conta2.setSaldo(200.0);
        System.out.println(conta2.toString());

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
    }
}
