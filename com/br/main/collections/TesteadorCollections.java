package com.br.main.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Collections é uma classe utilitária que fornece métodos estáticos para operar em coleções, como listas, conjuntos e mapas. 
 * Ela oferece funcionalidades como ordenação, busca, sincronização e manipulação de coleções. 
 * A classe Collections é parte do pacote java.util e é amplamente utilizada para facilitar o trabalho com coleções em Java.
*/
public class TesteadorCollections {
    
    public static void main(String[] args) {
        testarList();
        testarSet();
        testarMap();
        testarQueue();
        testarLinkedList();
    }
    
    // Tipos de estruturas de dados em Java:

    // List: Uma coleção ordenada que permite elementos duplicados. Exemplo: ArrayList
    private static void testarList() {
        List<String> lista = List.of("elemento1", "elemento2", "elemento3");
        List<String> lista2 = new ArrayList<>();
        lista2.add("elemento1");
        lista2.add("elemento2");
        lista2.add("elemento3");
        lista2.add("elemento1"); // Permite elementos duplicados
        System.out.println("\n\n\t IMPRESSÃO DO TESTE DE LIST:");
        lista2.forEach(e -> System.out.println(e)); // Imprime os elementos da lista
    }

    // Set: Uma coleção que não permite elementos duplicados. Exemplo: HashSet
    private static void testarSet() {
        Set<String> conjunto = Set.of("elemento1", "elemento2", "elemento3");
        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("elemento1");
        conjunto2.add("elemento2");
        conjunto2.add("elemento3");
        conjunto2.add("elemento1"); // Não permite elementos duplicados, será ignorado
        System.out.println("\n\n\t IMPRESSÃO DO TESTE DE SET:");
        conjunto2.forEach(e -> System.out.println(e)); // Imprime os elementos do conjunto
    }

    // Map: Uma coleção que associa chaves a valores. Exemplo: HashMap
    private static void testarMap() {
        Map<String, String> mapa = Map.of("chave1", "valor1", "chave2", "valor2");
        Map<String, String> mapa2 = new HashMap<>();
        mapa2.put("chave1", "valor1");
        mapa2.put("chave2", "valor2");
        mapa2.put("chave1", "valor3"); // Sobrescreve o valor associado à chave "chave1"
        System.out.println("\n\n\t IMPRESSÃO DO TESTE DE MAP:");
        mapa2.forEach((chave, valor) -> System.out.println("Chave: " + chave + ", Valor: " + valor));
    }

    // Queue: Uma coleção que segue a ordem de inserção. Exemplo: LinkedList
    private static void testarQueue() {
        Queue<String> fila = new LinkedList<>();
        fila.add("primeiro");
        fila.add("segundo");
        fila.add("terceiro");

        System.out.println("\n\n\t IMPRESSÃO DO TESTE DE QUEUE:");
        System.out.println(fila.poll());
        System.out.println(fila);
    }

    // LinkedList: Uma implementação de lista que permite inserções e remoções eficientes em ambas as extremidades. Exemplo: LinkedList
    private static void testarLinkedList() {
        LinkedList<String> listaEncadeada = new LinkedList<>();
        listaEncadeada.addLast("elemento3");
        listaEncadeada.add("elemento1");
        listaEncadeada.addFirst("elemento2");
        

        System.out.println("\n\n\t IMPRESSÃO DO TESTE DE LINKEDLIST:");
        System.out.println(listaEncadeada); // Imprime a lista encadeada
    }
    
    
}
