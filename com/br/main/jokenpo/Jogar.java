package com.br.main.jokenpo;

import com.br.main.jokenpo.Gesto.GestoEnum;

public class Jogar {
    public static void main(String[] args) {

        // Criando jogadores
        Jogador jogador1 = new Jogador("Alice");
        Jogador jogador2 = new Jogador("Bob");

        // Escolhendo gestos
        GestoEnum gestoJogador1 = jogador1.escolherGesto();
        GestoEnum gestoJogador2 = jogador2.escolherGesto();

        // Exibindo os gestos escolhidos
        System.out.println(jogador1.getNome() + " escolheu: " + gestoJogador1);
        System.out.println(jogador2.getNome() + " escolheu: " + gestoJogador2);

        // Determinando o vencedor
        Gesto gesto = new Gesto();
        GestoEnum vencedor = gesto.gestoVencedor(gestoJogador1, gestoJogador2);

        if (vencedor == null) {
            System.out.println("Empate!");
        } else if (vencedor == gestoJogador1) {
            System.out.println(jogador1.getNome() + " venceu!");
        } else {
            System.out.println(jogador2.getNome() + " venceu!");
        }
    }
}
