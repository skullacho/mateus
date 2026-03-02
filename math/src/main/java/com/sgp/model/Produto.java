package com.sgp.model;

public class Produto{

    private String nome;
    private String categoria;
    private double preco;
    private int quantidade; 

    //Construtor p
    public Produto(){

    }
    
    //Contrutor com "regras"/ parâmetros
    public Produto(String nome, String categoria, double preco, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    //Método específico
    public double calcularValorTotal(){
        return preco * quantidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria(){ 
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() { 
        return quantidade;
    }

    public void setQuantidade(int quantidade) { 
        this.quantidade = quantidade;
    }

    // toString
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

}