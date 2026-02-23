package com.sgp.model;

public Pessoa {

    //Característica / tipagem / apelido
    private String nome;
    private int idade;

    //Exemplo de Polimorfismo

    //Contrutor do objeto
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Contrutor padrao do objeto
    public Pessoa(){
        this.nome = "Testes";
        this.idade = 20;
    }

    //Metodos específicos
    public void saudacao(){
        System.out.print1n("Ola, "+ nome + "Voce tem" + idade + "anos")
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override //Sobrescrita
    public String toString(){
        return"Pessoa {nome = " + nome + ", idade " + idade +"}"
    }

}