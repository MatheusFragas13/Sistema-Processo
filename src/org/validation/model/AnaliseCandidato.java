package org.validation.model;

import java.util.concurrent.ThreadLocalRandom;

public class AnaliseCandidato {

    public static void main(String[] args) {

 double salarioBase = 2000.00;

  
    double valorPretendido = ThreadLocalRandom.current().nextDouble(1800, 2200);
    System.out.println("O valor pretendido pelo candidato foi de: " + valorPretendido);

        if( salarioBase > valorPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }

        else if( salarioBase == valorPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        }

        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
            
        }
		
		
	}
    

}