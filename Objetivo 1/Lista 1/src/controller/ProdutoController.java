package controller;
import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        System.out.println("\n" + produto1.toString());

        Produto produto2 = new Produto("Borracha", "Branca", 1.5, 40, 2);
        Produto produto3 = new Produto("Banana", "Amarela", 3.99, 50, 3);
        Produto produto4 = new Produto("Régua", "Mole", 4.0, 60, 4);
        Produto produto5 = new Produto("Caderno", "Capa dura", 3.9, 70, 5);
        System.out.println("\n" + produto2.toString());

        produto1.setNome("Prato");
        produto1.setDescricao("Roxo");
        produto1.setValor(20.0);
        produto1.setEstoque(100);
        produto2.setNome("Faca");
        produto2.setDescricao("Inox");
        produto2.setValor(4.0);
        produto2.setEstoque(200);

        System.out.println("\n" + produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        System.out.println("\n" + produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        System.out.println(produtos + "\n \n");

        Map<Integer, Produto> produtosMap = new HashMap<>();
        produtosMap.put((produto1.getId()), produto1);
        produtosMap.put((produto2.getId()), produto2);
        produtosMap.put((produto3.getId()), produto3);
        produtosMap.put((produto4.getId()), produto4);
        produtosMap.put((produto5.getId()), produto5);


        System.out.println(produtosMap.get((produto3.getId())));

        Collections.sort(produtos, Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos);

        }
    }
