package com.br.main.jokenpo;

// enumeração dos gestos possíveis
public class Gesto {

    // criar os gestos como enum
    public enum GestoEnum {
        PEDRA,
        PAPEL,
        TESOURA
    }

    public GestoEnum gestoVencedor(GestoEnum gestoJogador1, GestoEnum gestoJogador2){
        if (gestoJogador1 == gestoJogador2) {
            return null; // empate
        } else if ((gestoJogador1 == GestoEnum.PEDRA && gestoJogador2 == GestoEnum.TESOURA) ||
                   (gestoJogador1 == GestoEnum.PAPEL && gestoJogador2 == GestoEnum.PEDRA) ||
                   (gestoJogador1 == GestoEnum.TESOURA && gestoJogador2 == GestoEnum.PAPEL)) {
            return gestoJogador1; // jogador 1 vence
        } else {
            return gestoJogador2; // jogador 2 vence
        }
    }
    
}