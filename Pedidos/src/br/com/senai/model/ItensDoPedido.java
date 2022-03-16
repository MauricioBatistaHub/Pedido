package br.com.senai.model;

public class ItensDoPedido {
    private Produto produto;
    private int quantidade;

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItensDoPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
