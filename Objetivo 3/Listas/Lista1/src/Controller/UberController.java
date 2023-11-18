package Controller;

import Model.Corrida;
import Model.Motorista;
import Model.Usuario;
import Model.Veiculo;

import java.text.NumberFormat;
import java.util.Comparator;

import java.util.*;

public class UberController {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(
                1L, "Carlos", "carlos@gmail.com", "53 564367554"
        );

        Veiculo veiculo1 = new Veiculo(
                1L, "Ford", "Hfsd432", 2023
        );

        List<Veiculo> veiculosA = new ArrayList<>();
        veiculosA.add(veiculo1);

        Motorista motorista1 = new Motorista(
                1L, "Alfredo", "alfredo@gmail.com", "53 564646654", veiculosA
        );

        Corrida c1 = new Corrida(
                1L, "dinheiro", "a vista", new Date(2023, 12, 1), 30.00, usuario1, motorista1
        );
        Corrida c2 = new Corrida(
                2L, "cartão", "a vista", new Date(2023, 10, 12), 15.00, usuario1, motorista1
        );

        usuario1.getCorridas().add(c1);
        usuario1.getCorridas().add(c2);

        System.out.println("\nCorridas por usuario: ");
        usuario1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(usuario1.getCorridas());

        System.out.println("\nCorridas por motorista: ");
        motorista1.getCorridas().add(c1);
        motorista1.getCorridas().add(c2);
        motorista1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(motorista1.getCorridas());

        System.out.println("\nTotal das corridas de motorista: \n" + motorista1.getNome() + "= ");
        System.out.println(NumberFormat.getCurrencyInstance().format(
                motorista1.getCorridas().stream().mapToDouble(c-> c.getPreco()).sum()
        ));
    }
    }