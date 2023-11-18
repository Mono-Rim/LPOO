package Controller;

import Model.Fornecedor;
import Model.Fornecimento;
import Model.Produto;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FornecimentoController {
    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor(
                "54353", "HFM@gmail.com", "HFM"
        );
        Fornecedor f2 = new Fornecedor(
                "765756", "HYR@gmail.com", "HYR"
        );

        Produto p1 = new Produto(
                1L, "Batata", 10, 30.00, f1
        );
        Produto p2 = new Produto(
                2L, "Cenoura", 7, 15.00, f1
        );
        Produto p3 = new Produto(
                3L, "Beterraba", 5, 10.00, f2
        );

        double total = p1.getPreco()*10;
        p1.setQuantidade(p1.getQuantidade()-10);
        Fornecimento fm1 = new Fornecimento(
                new Date(2023,12,1), total, f1, p1
        );

        total = p2.getPreco() * 7;
        p2.setQuantidade(p2.getQuantidade()-7);
        Fornecimento fm2 = new Fornecimento(
                new Date(2023,12,2), total, f1, p2
        );

        total = p3.getPreco()*5;
        p3.setQuantidade(p3.getQuantidade()-5);
        Fornecimento fm3 = new Fornecimento(
                new Date(2023,12,3), total, f2, p3
        );

       List<Fornecimento> fornecimentos = new ArrayList<>();
       fornecimentos.add(fm1);
       fornecimentos.add(fm2);
       fornecimentos.add(fm3);
       System.out.println("\nLista de fornecimentos: ");
        System.out.println(fornecimentos);

        System.out.println();
        System.out.println("\nTotal fornecido = " + NumberFormat.getCompactNumberInstance().format(
                fornecimentos.stream().mapToDouble(f->f.getValorTotal()).sum()
        ));
    }
}
