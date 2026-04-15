package com.br.main.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.br.main.objetos.Pessoa;

/**
 * Collections é uma classe utilitária que fornece métodos estáticos para operar em coleções, como listas, conjuntos e mapas. 
 * Ela oferece funcionalidades como ordenação, busca, sincronização e manipulação de coleções. 
 * A classe Collections é parte do pacote java.util e é amplamente utilizada para facilitar o trabalho com coleções em Java.
*/
public class TesteadorCollections {
    
    public static void main(String[] args) {

        System.err.println("##########################################################################################");
        System.err.println("################################# INICIO DOS TESTES ######################################");
        System.err.println("##########################################################################################");

        testarList();
        System.err.println("##########################################################################################");
        testarSet();
        System.err.println("##########################################################################################");
        testarMap();
        System.err.println("##########################################################################################");
        testarQueue();
        System.err.println("##########################################################################################");
        testarLinkedList();
    }
    
    // Tipos de estruturas de dados em Java:

    // List: Uma coleção ordenada que permite elementos duplicados. Exemplo: ArrayList
    private static void testarList() {
        List<String> lista2 = new ArrayList<>();
        lista2.add("elemento1");
        lista2.add("elemento2");
        lista2.add("elemento3");
        lista2.add("elemento1"); // Permite elementos duplicados
        System.out.println("\n\nIMPRESSÃO DO TESTE DE LIST:");
        lista2.forEach(e -> System.out.println(e)); // Imprime os elementos da lista

        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("João", 30, "123456789"));
        listaPessoas.add(new Pessoa("Maria", 25, "987654321"));
        listaPessoas.add(new Pessoa("João", 30, "123456789")); // Permite objetos duplicados
        System.out.println("\n\nIMPRESSÃO DO TESTE DE LIST COM OBJETOS:");
        listaPessoas.forEach(p -> System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade() + ", CPF: " + p.getCpf())); // Imprime os objetos da lista de pessoas
        listaPessoas.get(0); // É possível acessar elementos por índice, como em um array tradicional.
    }

    // Set: Uma coleção que não permite elementos duplicados. Exemplo: HashSet
    private static void testarSet() {
        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("elemento1");
        conjunto2.add("elemento2");
        conjunto2.add("elemento3");
        conjunto2.add("elemento1"); // Não permite elementos duplicados, será ignorado
        System.out.println("\n\nIMPRESSÃO DO TESTE DE SET:");
        conjunto2.forEach(e -> System.out.println(e)); // Imprime os elementos do conjunto

        Set<Pessoa> listaPessoas = new HashSet<>();
        listaPessoas.add(new Pessoa("João", 30, "123456789"));
        listaPessoas.add(new Pessoa("Maria", 25, "987654321"));
        listaPessoas.add(new Pessoa("João", 30, "123456789")); // Não permite objetos duplicados, será ignorado
        System.out.println("\n\nIMPRESSÃO DO TESTE DE SET COM OBJETOS:");
        listaPessoas.forEach(p -> System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade() + ", CPF: " + p.getCpf())); // Imprime os objetos do conjunto de pessoas

        //listaPessoas.get(0);
        // Acessar elementos por índice não é possível em um Set, pois ele não mantém a ordem de inserção e não possui índices como uma List.
        // Para acessar elementos em um Set, é necessário iterar sobre ele usando um loop ou um iterador, como mostrado no exemplo acima.

        // jõao está sendo impresso duas vezes porque o HashSet utiliza o método hashCode() e equals() para determinar a unicidade dos objetos.
        // Se a classe Pessoa não tiver esses métodos implementados corretamente, o HashSet pode considerar objetos diferentes como iguais, permitindo a inserção de objetos duplicados. 
        // Para evitar isso, é necessário implementar os métodos hashCode() e equals() na classe Pessoa, garantindo que objetos com os mesmos atributos sejam considerados iguais pelo HashSet.
    }

    // Map: Uma coleção que associa chaves a valores. Exemplo: HashMap
    // Vantagem: Permite acesso rápido aos valores com base nas chaves. Desvantagem: Não mantém a ordem de inserção.
    private static void testarMap() {
        Map<String, String> mapa2 = new HashMap<>();
        mapa2.put("chave1", "valor1");
        mapa2.put("chave2", "valor2");
        mapa2.put("chave1", "valor3"); // Sobrescreve o valor associado à chave "chave1"
        System.out.println("\n\nIMPRESSÃO DO TESTE DE MAP:");
        mapa2.forEach((chave, valor) -> System.out.println("Chave: " + chave + ", Valor: " + valor));

        Map<Pessoa, String> mapaPessoas = new HashMap<>();
        mapaPessoas.put(new Pessoa("João", 30, "123456789"), "Desenvolvedor");
        mapaPessoas.put(new Pessoa("Maria", 25, "987654321"), "Designer");
        mapaPessoas.put(new Pessoa("João", 30, "123456789"), "Gerente"); // Sobrescreve o valor associado à chave "João"
        System.out.println("\n\nIMPRESSÃO DO TESTE DE MAP COM OBJETOS COMO CHAVE:");
        mapaPessoas.forEach((pessoa, profissao) -> System.out.println("Pessoa: " + pessoa.getNome() + ", Profissão: " + profissao));
    }

    // Queue: Uma coleção que segue a ordem de inserção. Exemplo: LinkedList
    private static void testarQueue() {
        Queue<String> fila = new LinkedList<>();
        fila.add("primeiro");
        fila.add("segundo");
        fila.add("terceiro");

        System.out.println("\n\nIMPRESSÃO DO TESTE DE QUEUE:");
        System.out.println(fila.poll());
        System.out.println(fila);

        Queue<Pessoa> filaPessoas = new LinkedList<>();
        filaPessoas.add(new Pessoa("João", 30, "123456789"));
        filaPessoas.add(new Pessoa("Maria", 25, "987654321"));
        // ao inserir um valor repetido, ele é adicionado normalmente, pois a Queue não tem restrições de elementos duplicados.
        filaPessoas.add(new Pessoa("João", 30, "123456789"));

        System.out.println("\n\nIMPRESSÃO DO TESTE DE QUEUE COM OBJETOS:");
        System.out.println("Primeira pessoa na fila: " + filaPessoas.poll().getNome());
        System.out.println("Pessoas restantes na fila:");
        filaPessoas.forEach(p -> System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade() + ", CPF: " + p.getCpf()));


    }

    // LinkedList: Uma implementação de lista que permite inserções e remoções eficientes em ambas as extremidades. Exemplo: LinkedList
    private static void testarLinkedList() {
        LinkedList<String> listaEncadeada = new LinkedList<>();
        listaEncadeada.addLast("elemento3");
        listaEncadeada.add("elemento1");
        listaEncadeada.addFirst("elemento2");
        

        System.out.println("\n\nIMPRESSÃO DO TESTE DE LINKEDLIST:");
        System.out.println(listaEncadeada); // Imprime a lista encadeada
    }
    
    
}
