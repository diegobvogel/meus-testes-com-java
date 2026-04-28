package com.br.main.jokenpo;

import com.br.main.jokenpo.Gesto.GestoEnum;

public class Jogador implements Mao {
    private String nome;
    private GestoEnum gestoEscolhido;

    public Jogador(String nome) {
        this.nome = nome;
    }

    @Override
    public GestoEnum escolherGesto() {
        // Escolher gesto de forma aleatória
        int escolha = (int) (Math.random() * 3);
        switch (escolha) {
            case 0:
                return GestoEnum.PEDRA;
            case 1:
                return GestoEnum.PAPEL;
            case 2:
                return GestoEnum.TESOURA;
            default:
                return GestoEnum.PEDRA; // padrão
        }
    }

    public void setGestoEscolhido(GestoEnum gesto) {
        this.gestoEscolhido = gesto;
    }

    public GestoEnum getGestoEscolhido() {
        return gestoEscolhido;
    }

    public String getNome() {
        return nome;
    }
    
}
