package com.br.main.singleton;

public class TestarSingleton {
    public static void main(String[] args) {
        SingletonSimples singleton1 = SingletonSimples.getInstance();
        SingletonSimples singleton2 = SingletonSimples.getInstance();

        System.out.println("Singleton 1: " + singleton1);
        System.out.println("Singleton 2: " + singleton2);

        singleton1.incrementarContador();
        singleton2.incrementarContador();
        
        System.out.println("Contador do Singleton 1: " + singleton1.contador);
        System.out.println("Contador do Singleton 2: " + singleton2.contador);

        if (singleton1 == singleton2) {
            System.out.println("Ambas as instâncias são iguais. Singleton funciona!");
        } else {
            System.out.println("As instâncias são diferentes. Singleton falhou!");
        }
    }
}
