package Controller;

import Model.Cliente;
import Model.ItemPedido;
import Model.Pedido;
import Model.Produto;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class ClientePedidoController {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(
                1L, "Ana ", "da Silva", true
        );
        System.out.println("\n Cliente " + cliente1.getNome() + "" + cliente1.getSobrenome() + " cadastrado com sucesso");

        Produto produto1 = new Produto(1L,"Arroz", "5Kg Ceolin", 18.5, true);

        ItemPedido item = new ItemPedido(
                1L, 2, (2 * produto1.getValor()), true, produto1
        );

        List<ItemPedido> itens = new ArrayList<>();
        itens.add(item);

        Pedido pedido1 = new Pedido(
                1L, "a vista", "aberto",
                new GregorianCalendar(2021,4,12,10,00),
                new GregorianCalendar(2021,4,12,10,00),
                1200.00, true, cliente1, itens
        );

        System.out.println("\n Pedido realizado com sucesso. Numero do pedido: " + pedido1.getId_pedido());
        System.out.println("\nDetalhes do pedido:" + pedido1);

        cliente1.getPedidos().add(pedido1);

        System.out.println("\nRelação de pedidos de um determinado cliente:");
        System.out.println("\nPedidos do cliente " + cliente1.getNome() + " " + cliente1.getSobrenome());
        System.out.println(cliente1.getPedidos());


    }
}
