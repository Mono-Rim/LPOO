package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {

        Bicicleta b1 = new Bicicleta();

        b1.setTamanhoRoda(15);
        b1.setChassi("H453SAER");
        b1.setNumeroDeEixos(1);
        b1.setPropulsao("Nao");
        b1.setMarca("Monark");
        b1.setModelo("HFG435");
        b1.setAnoFabricacao(2004);
        System.out.println(b1);

        Bicicleta b2 = new Bicicleta();

        b2.setTamanhoRoda(15);
        b2.setChassi("H453SAER");
        b2.setNumeroDeEixos(1);
        b2.setPropulsao("Nao");
        b2.setMarca("Monark");
        b2.setModelo("HFGH35");
        b2.setAnoFabricacao(2003);
        System.out.println(b2);

        Bicicleta b3 = new Bicicleta();

        b3.setTamanhoRoda(15);
        b3.setChassi("H453SAER");
        b3.setNumeroDeEixos(1);
        b3.setPropulsao("Nao");
        b3.setMarca("Monark");
        b3.setModelo("8763HFG");
        b3.setAnoFabricacao(2002);
        System.out.println(b3);

        Bicicleta b4 = new Bicicleta();

        b4.setTamanhoRoda(15);
        b4.setChassi("H453SAER");
        b4.setNumeroDeEixos(1);
        b4.setPropulsao("Nao");
        b4.setMarca("Monark");
        b4.setModelo("65467");
        b4.setAnoFabricacao(2001);
        System.out.println(b4);

        Bicicleta b5 = new Bicicleta();

        b5.setTamanhoRoda(15);
        b5.setChassi("H453SAER");
        b5.setNumeroDeEixos(1);
        b5.setPropulsao("Nao");
        b5.setMarca("Monark");
        b5.setModelo("654456");
        b5.setAnoFabricacao(2000);
        System.out.println(b5);

        Carro car1 = new Carro();

        car1.setCapacidadePortaMalas(200);
        car1.setNumeroDeEixos(4);
        car1.setPropulsao("sim");
        car1.setMarca("Ford");
        car1.setModelo("Ka");
        car1.setAnoFabricacao(1999);
        car1.setRenavam("KIUL78");
        car1.setChassi("KJHG567");
        car1.setPlaca("GDFY5634");
        System.out.println(car1);

        Carro car2 = new Carro();

        car2.setCapacidadePortaMalas(200);
        car2.setNumeroDeEixos(4);
        car2.setPropulsao("sim");
        car2.setMarca("Ford");
        car2.setModelo("Ka");
        car2.setAnoFabricacao(1998);
        car2.setRenavam("ASF43T43");
        car2.setChassi("GFDH654");
        car2.setPlaca("HFG5765UJHF");
        System.out.println(car2);

        Carro car3 = new Carro();

        car3.setCapacidadePortaMalas(200);
        car3.setNumeroDeEixos(4);
        car3.setPropulsao("sim");
        car3.setMarca("Ford");
        car3.setModelo("Ka");
        car3.setAnoFabricacao(1997);
        car3.setRenavam("GF5765");
        car3.setChassi("HFG57");
        car3.setPlaca("KLU879");
        System.out.println(car3);

        Carro car4 = new Carro();

        car4.setCapacidadePortaMalas(200);
        car4.setNumeroDeEixos(4);
        car4.setPropulsao("sim");
        car4.setMarca("Ford");
        car4.setModelo("Ka");
        car4.setAnoFabricacao(1996);
        car4.setRenavam("HGF54");
        car4.setChassi("HGFH5");
        car4.setPlaca("GDFJ6");
        System.out.println(car4);

        Carro car5 = new Carro();

        car5.setCapacidadePortaMalas(200);
        car5.setNumeroDeEixos(4);
        car5.setPropulsao("sim");
        car5.setMarca("Ford");
        car5.setModelo("Ka");
        car5.setAnoFabricacao(1995);
        car5.setRenavam("GS4344");
        car5.setChassi("SDFG5");
        car5.setPlaca("HFG54");
        System.out.println(car5);

        Caminhao cam1 = new Caminhao();

        cam1.setCapacidadeDeCarga(400);
        cam1.setNumeroDeEixos(8);
        cam1.setPropulsao("nao");
        cam1.setMarca("Ford");
        cam1.setModelo("654HGF");
        cam1.setAnoFabricacao(1994);
        cam1.setRenavam("MBNV53");
        cam1.setChassi("HGF54");
        cam1.setPlaca("JHG6545");
        System.out.println(cam1);

        Caminhao cam2 = new Caminhao();

        cam2.setCapacidadeDeCarga(400);
        cam2.setNumeroDeEixos(8);
        cam2.setPropulsao("nao");
        cam2.setMarca("Ford");
        cam2.setModelo("654GHFD");
        cam2.setAnoFabricacao(1993);
        cam2.setRenavam("43TDFG");
        cam2.setChassi("654GHF");
        cam2.setPlaca("HGF5");
        System.out.println(cam2);

        Caminhao cam3 = new Caminhao();

        cam3.setCapacidadeDeCarga(400);
        cam3.setNumeroDeEixos(8);
        cam3.setPropulsao("nao");
        cam3.setMarca("Ford");
        cam3.setModelo("654HG");
        cam3.setAnoFabricacao(1992);
        cam3.setRenavam("12RFC");
        cam3.setChassi("L985");
        cam3.setPlaca("GHDF43");
        System.out.println(cam3);

        Caminhao cam4 = new Caminhao();

        cam4.setCapacidadeDeCarga(400);
        cam4.setNumeroDeEixos(8);
        cam4.setPropulsao("nao");
        cam4.setMarca("Ford");
        cam4.setModelo("JGH6");
        cam4.setAnoFabricacao(1991);
        cam4.setRenavam("5423SF");
        cam4.setChassi("654HGF");
        cam4.setPlaca("i54353");
        System.out.println(cam4);

        Caminhao cam5 = new Caminhao();

        cam5.setCapacidadeDeCarga(400);
        cam5.setNumeroDeEixos(8);
        cam5.setPropulsao("nao");
        cam5.setMarca("Mercedes");
        cam5.setModelo("HF1");
        cam5.setAnoFabricacao(1990);
        cam5.setRenavam("58345FGK");
        cam5.setChassi("6K54JN");
        cam5.setPlaca("I543543");
        System.out.println(cam5);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        veiculos.add(b5);
        veiculos.add(car1);
        veiculos.add(car2);
        veiculos.add(car3);
        veiculos.add(car4);
        veiculos.add(car5);
        veiculos.add(cam1);
        veiculos.add(cam2);
        veiculos.add(cam3);
        veiculos.add(cam4);
        veiculos.add(cam5);

        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println("Veiculos cadastrados:\n" + veiculos);

        System.out.print("\nAutomoveis cadastrados:\n");
        veiculos.forEach(v -> {
            if (v instanceof Automovel) {
                System.out.print(v);
            }
        });

        System.out.print("\nLista de bicicletas:\n ");
        veiculos.forEach(v -> {
            if (v instanceof Bicicleta) {
                System.out.print(v);
            }
        });

        System.out.print("\n\nVeiculos que a placa começa por I ou i:\n ");
        veiculos.forEach(v -> {
            if (v instanceof Automovel) {
                if( ((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i") ) {
                    System.out.print(v);
                }
            }
        });

    }
}
