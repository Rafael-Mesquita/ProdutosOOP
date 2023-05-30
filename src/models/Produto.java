package models;

public class Produto {
    private int Id;
    private String NomeDoProduto;
    private double Preco;

    public Produto(int id, String nomeDoProduto, double preco) {
        this.Id = id;
        this.NomeDoProduto = nomeDoProduto;
        this.Preco = preco;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNome() {
        return this.NomeDoProduto;
    }

    public void setNome(String nome) {
        this.NomeDoProduto = nome;
    }

    public double getPreco() {
        return this.Preco;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }

    public String toString() {
        return "\nID: " + this.Id + "\nNome do Produto: " + this.NomeDoProduto + "\nPreço: " + this.Preco + "\n";
    }
}