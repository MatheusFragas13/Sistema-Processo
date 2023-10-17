package org.validation.model;

import java.util.concurrent.ThreadLocalRandom;

public class SelecionarCandidato {

    public static void main(String[] args) {
        double salarioBase = 2000.0;
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int selecionados = 0;
        int proximoCandidato = 0;
        while (selecionados < 5 && proximoCandidato < candidatos.length) {
            String candidato = candidatos[proximoCandidato++];
            double valorPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " está pedindo " + valorPretendido);
            if (valorPretendido > salarioBase) {
                System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");

            } else {

                System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
                selecionados++;

            }

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1900, 2500);
    }
}
