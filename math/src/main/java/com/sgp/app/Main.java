package com.sgp.app;

import com.sgp.model.Pessoa;

public class Main{

    public static void main(String[] args)
    {
        Pessoa aluno = new pessoa("Davi", 16);

        aluno.saudacao();

        aluno.getNome();

        aluno.setNome("Teste");

        


    }
}