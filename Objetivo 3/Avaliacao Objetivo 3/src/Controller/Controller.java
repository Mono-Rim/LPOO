package Controller;

import Model.*;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class Controller {
    public static void main(String[] args) {

        Fornecedor fornecedor1 = new Fornecedor(654654,
                "fornecedor1@gmail.com", "Carlos");

        Produto produto1 = new Produto(1L, "Batata",
                100, 5.00, fornecedor1);

        Produto produto2 = new Produto(2L, "Laranja",
                200, 3.50, fornecedor1);
        Vendedor vendedor1 = new Vendedor(2023,
                "Matias", "Rua Frederico Junior",
                "Centro", "9654654", "Pelotas",
                "RS", "Loja");
        Vendedor vendedor2 = new Vendedor(2024,
                "Cleber", "Rua Frederico Mendes",
                "Fragata", "9654654", "Pelotas",
                "RS", "Loja");

        Pedido pedido1 = new Pedido(1L, new Date(2023,10,1),
                0, Tipo.PENDENTE, vendedor1);
        Pedido pedido2 = new Pedido(2L, new Date(2023, 10, 2),
                0, Tipo.PENDENTE, vendedor2);

        Item item1 = new Item(
                1l, 5, 200, produto1
        );
        Item item2 = new Item(
                2l, 10, 150, produto2
        );

        pedido1.getItens().add(item1);
        pedido2.getItens().add(item2);

        pedido1.setValor(item1.getQuantidade()*item1.getDesconto()*produto1.getPreco());
        System.out.println(pedido1.getValor());
        pedido2.setValor(item2.getQuantidade()*item2.getDesconto()*produto2.getPreco());
        System.out.println(pedido2.getValor());

        List<Pedido> vendas = new ArrayList<>();
        vendas.add(pedido1);
        vendas.add(pedido2);

      System.out.println("\nRelatório de vendas:" + vendas);

      Fornecimento f1 = new Fornecimento(new Date(2023,10,3), 10, produto1, fornecedor1);
      Fornecimento f2 = new Fornecimento(new Date(2023,10,4), 20, produto2, fornecedor1);

      produto1.setQuantidade((int) f1.getValorTotal());
      produto2.setQuantidade((int)f2.getValorTotal());

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(f1);
        fornecimentos.add(f2);

        System.out.println(fornecimentos);
    }
}
