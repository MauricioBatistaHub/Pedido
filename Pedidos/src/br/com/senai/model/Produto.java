package br.com.senai.model;

public class Produto{
    private String nome;
    private double preco;

    public void NovoProduto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
