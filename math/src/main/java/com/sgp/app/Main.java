package com.sgp.app;

import com.sgp.model.Produto;

public class Main{
    public static void main(String[] args) {

        //Objeto sendo criado com parâmetros
        Produto p1 = new Produto("Pc gamer i9 14300f", "Computadores", 8400.99, 5 );

        // Mostrando o objeto
        System.out.println(p1);

        // Chamando método específico
        double total = p1.calcularValorTotal();
        System.out.println("Valor total em estoque: " + total);

        //Usando Setters
        p1.setPreco(8800.10);
        p1.setQuantidade(2);
        p1.setCategoria("Eletrodomésticos");

        //Valores atualizados
        System.out.println("Após atualização:");
        System.out.println(p1);
        System.out.println("Novo valor total: " + p1.calcularValorTotal());
    }
}