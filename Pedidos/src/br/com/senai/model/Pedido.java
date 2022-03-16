package br.com.senai.model;

import java.util.ArrayList;

public class Pedido {
    private String descricao;
    private String data;
    private double total;
    private ArrayList<ItensDoPedido> itens;

    public Pedido(){
        itens = new ArrayList<>();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setItens(int quantidade, Produto produto){
        ItensDoPedido itemDoPedido = new ItensDoPedido();
        itemDoPedido.setProduto(produto);
        itemDoPedido.setQuantidade(quantidade);

        itens.add(itemDoPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", total=" + total +
                ", itensDoPedido=" + itens +
                '}';
    }
    public double CalcTotal(double valor1, int qntd1, double valor2, int qntd2, double valor3, int qntd3, double valor4, int qntd4, double valor5, int qntd5){
        this.total = (valor1 * qntd1) + (valor2 * qntd2) + (valor3 * qntd3) + (valor4 * qntd4) + (valor5 * qntd5);
        return total;
    }
}
