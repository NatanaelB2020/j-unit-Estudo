package com.example.junitEstudo.pessoa;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Inicio a conexão");
    }

    public static void finalizarConexão(){
        LOGGER.info("Finalizou a conexão");
    }
     public static void addDados(Pessoa pessoa){
        LOGGER.info("add nova pessoa no banco");
     }

     public static void removeDados(Pessoa pessoa){
        LOGGER.info("remove pessoa do banco");
     }

}
