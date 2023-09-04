package controller;

import model.Carro;

public class CarroController {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        System.out.println(carro1.toString());

        Carro carro2 = new Carro("Toyota", "Etios", 2004);
        System.out.println();
        System.out.println(carro2.toString());

        carro1.setMarca("Ford");
        carro1.setModelo("Fiesta");
        carro1.setAnoFabricacao(2000);
        carro2.setMarca("Fiat");
        carro2.setModelo("Uno");
        carro2.setAnoFabricacao(2018);

        System.out.println();
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());
        System.out.println();
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());
    }
}
