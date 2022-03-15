package PraticaIntegradora1.Exercicio2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Distribuidora {

    public static  void  main(String[] args){
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Pereciveis("Iogurte", 9.50, 2));
        produtos.add(new NaoPereciveis("Arroz", 5.9, "Cereais"));
        produtos.add(new Pereciveis("Banana", 4.9, 1));
        produtos.add(new NaoPereciveis("Vodka", 29.90, "Destilados"));
        produtos.add(new Pereciveis("Presunto", 9.90, 3));
        double total = produtos.stream().map(produto -> produto.calcular(5)).mapToDouble(Double::valueOf).sum();
        produtos.forEach(produto -> System.out.println("Venda " + (produtos.indexOf(produto)+1) + ": R$" + produto.calcular(5)));
        System.out.println("----------");
        System.out.println("Total das vendas: R$" + total);


    }
}
