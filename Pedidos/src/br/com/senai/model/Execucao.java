package br.com.senai.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Execucao {

    public void Iniciar(){

    //criação de 10 produtos
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        Produto produto5 = new Produto();
        Produto produto6 = new Produto();
        Produto produto7 = new Produto();
        Produto produto8 = new Produto();
        Produto produto9 = new Produto();
        Produto produto10 = new Produto();

        produto1.NovoProduto("Arroz", 283);
        produto2.NovoProduto("Feijão", 15);
        produto3.NovoProduto("Farinha", 13);
        produto4.NovoProduto("Macarrão", 12);
        produto5.NovoProduto("Banana", 2.85);
        produto6.NovoProduto("Chocolate", 5);
        produto7.NovoProduto("Maça", 3.50);
        produto8.NovoProduto("Uva", 2.89);
        produto9.NovoProduto("Fermento", 5.99);
        produto10.NovoProduto("Cálcio", 99);

        Pedido pedido1 = new Pedido();
        pedido1.setDescricao("itens do mercado, semana 1");
        pedido1.setData("16/03/2022");
        pedido1.setTotal(pedido1.CalcTotal(283,2,15,3,13,6, 12,7,2.85,1 ));
        pedido1.setItens(2, produto1);
        pedido1.setItens(3,produto2);
        pedido1.setItens(6,produto3);
        pedido1.setItens(7,produto4);
        pedido1.setItens(1,produto5);

        Pedido pedido2 = new Pedido();
        pedido2.setDescricao("Itens de mercado, semana 2");
        pedido2.setData("23/03/2022");
        pedido2.setTotal(pedido2.CalcTotal(5,3,3.50,8,2.89,1,5.99,5,99,9));
        pedido2.setItens(3, produto6);
        pedido2.setItens(8, produto7);
        pedido2.setItens(1, produto8);
        pedido2.setItens(5, produto9);
        pedido2.setItens(9, produto10);



        System.out.println(pedido1.toString());
        System.out.println(pedido1.getTotal());
        System.out.println(pedido2.toString());
        System.out.println(pedido2.getTotal());
    }
}
