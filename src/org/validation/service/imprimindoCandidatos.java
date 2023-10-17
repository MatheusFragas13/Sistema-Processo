package org.validation.service;

public class imprimindoCandidatos {
    public static void main(String[] args){
    String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		
    System.out.println("Imprimindo com a ordem de seleção pelo índice");
    for(int x=0; x<candidatosSelecionados.length; x++) {
        System.out.println((x+1)+ "° Candidato é " + candidatosSelecionados [x] );
    }
    }  

}