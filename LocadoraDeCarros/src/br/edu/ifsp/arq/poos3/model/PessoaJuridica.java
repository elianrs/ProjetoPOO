package br.edu.ifsp.arq.poos3.model;

import java.util.List;

public class PessoaJuridica extends Cliente {

    private String cnpj;
    private String razaoSocial;
    private static List<String> lstCnpj;


    public PessoaJuridica(String nome, String cnpj, String razaoSocial) {
        super(nome);
        if(validaCnpj(cnpj)) {
            this.cnpj = cnpj;
            lstCnpj.add(cnpj);
        }
        this.razaoSocial = razaoSocial;
    }

    private boolean validaCnpj(String cnpj){
        boolean valido = false;

        if(!cnpj.trim().isEmpty()) {
            for (String a : lstCnpj) {
                if (!cnpj.equals(a)) {
                    valido = true;
                }
            }
        }else{
            valido = false;
        }
        return valido;
    }
}
