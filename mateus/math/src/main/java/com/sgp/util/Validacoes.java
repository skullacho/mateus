package main.java.com.sgp.util;

public class Validacoes {
    private Validacoes(){

    }

    public static boolean nomeValido(String nome){
        return  !(nome == null ||
                nome.trim().isEmpty() ||
                nome.matches(regex:".*\\d+.*")
        );
    }

    public static void mensagemErroNome(String nome){
        if (nome == null ||nome.trim().isEmpty()){
            return "Erro: o nome nao pode ser vazio";
        }else if (nome.matches(regex: ".*\\d+.*")){
            return "Erro: o nome nao pode conter numero";
        }
        return"";
    }

    public static String idadeValida(int idade){
        return idade >= 0 && idade <= 150;
    }

    public static String mensagemErroIdade(int idade){
        if(idade < 0){
            return "Erro: a idade nao pode ser negativo";
        }else if (idade > 150){
            return "Erro: idade invalida";
        }
        return "";
    }

    public static boolean alturaValida(double altura){

    }

    public static String mensagemErroAltura(double altura){

    }
}   

