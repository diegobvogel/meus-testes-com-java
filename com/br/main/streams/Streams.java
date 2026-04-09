package com.br.main.streams;
import java.util.stream.Collectors;

import java.util.*;

public class Streams {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 23));
        pessoas.add(new Pessoa("João", 41));
        pessoas.add(new Pessoa("Maria", 25));
        pessoas.add(new Pessoa("Pedro", 55));


        // List<Pessoa> nomesFiltrados = pessoas.stream()
        //         .filter(p -> p.nome.toUpperCase().contains("A"))
        //         .filter(p -> p.idade > 20)
        //         .collect(Collectors.toList());

        // // imprimir os nomes filtrados
        // nomesFiltrados.forEach(n -> System.out.println(n.nome));

        List<Integer> idades = pessoas.stream()
                .map(i -> i.idade)
                .collect(Collectors.toList());
        idades.forEach(i -> System.out.println(i));


        List<Integer> idades2 = new ArrayList<>();
        for (Pessoa p : pessoas) {
            idades2.add(p.idade);
        }
        for (Integer i : idades2) {
            System.out.println(i);
        }

    }

    public static class Pessoa {
        String nome;
        int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }

}