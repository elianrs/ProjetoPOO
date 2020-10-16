package br.edu.ifsp.arq.poos3.controller;

import java.io.*;

public class GerenciadorArquivo {

    public String leitor(String path) throws IOException {
        String texto = "";
        FileReader arquivo = new FileReader(path);
        BufferedReader buffer = new BufferedReader(arquivo);
        String linha;
        while((linha = buffer.readLine()) != null){
            texto = " " + linha;
        }
        buffer.close();
        arquivo.close();
        return texto;
    }

    public void escritor(String path, String linha)  throws IOException{
        FileWriter arquivo = new FileWriter(path, true);
        BufferedWriter buffer = new BufferedWriter(arquivo);
        buffer.append(linha + "\n");
        buffer.close();
        arquivo.close();
    }
}
