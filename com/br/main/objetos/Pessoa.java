package com.br.main.objetos;

public class Pessoa {

    // atributos
    String nome;
    int idade;
    String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // implementar os métodos hashCode() e equals() para garantir a unicidade dos objetos no HashSet
    @Override
    public int hashCode() {
        return cpf.hashCode(); // Utiliza o CPF como base para o hash code, garantindo que pessoas com o mesmo CPF sejam consideradas iguais
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica se os objetos são o mesmo
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica se o objeto é nulo ou de classe diferente
        Pessoa pessoa = (Pessoa) obj; // Faz o cast para Pessoa
        return cpf.equals(pessoa.cpf); // Compara os CPFs para determinar a igualdade
    }

}