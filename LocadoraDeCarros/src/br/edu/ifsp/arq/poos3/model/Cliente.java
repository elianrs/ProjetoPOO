package br.edu.ifsp.arq.poos3.model;

public class Cliente {

    private static int codigo;
    private String nome;

    public Cliente(String nome){
        codigo += 1;
        this.nome = nome;
    }
}
