package com.br.main.singleton;

public class SingletonSimples {

    private static SingletonSimples instance;

    public int contador = 0;

    private SingletonSimples() {
        // Construtor privado para evitar instanciamento externo
    }

    public static SingletonSimples getInstance() {
        if (instance == null) {
            instance = new SingletonSimples();
        }
        return instance;
    }

    public void incrementarContador() {
        contador++;
    }
    
}
