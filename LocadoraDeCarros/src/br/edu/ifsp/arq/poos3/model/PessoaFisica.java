package br.edu.ifsp.arq.poos3.model;

import javax.swing.*;
import java.util.List;

public class PessoaFisica extends Cliente{

    private String cpf;
    private static List<String> lstCpf;


    public PessoaFisica(String nome, String cpf) {
        super(nome);
        if(validaCpf(cpf)) {
            this.cpf = cpf;
        }
    }

    private boolean validaCpf(String cpf){
        boolean valido = false;

        if(!cpf.trim().isEmpty()) {
            for (String a : lstCpf) {
                if (!cpf.equals(a)) {
                    valido = true;
                }
            }
        }else{
            valido = false;
        }
        return valido;
    }
}
