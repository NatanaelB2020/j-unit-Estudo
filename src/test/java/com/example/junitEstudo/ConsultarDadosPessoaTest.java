package com.example.junitEstudo;

import com.example.junitEstudo.pessoa.BancoDeDados;
import com.example.junitEstudo.pessoa.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    static void configuraConexão(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configuração");
    }
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.addDados(new Pessoa("Natanael", LocalDate.of(1987, 9,13)));
    }

    @AfterEach
    void removeDadosParaTest(){
        BancoDeDados.removeDados(new Pessoa("Natanael", LocalDate.of(1987,9, 13)));
    }

    @Test
    void validarConcexao(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarConcexao2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexão();
        System.out.println("rodou finalizar conexão");
    }
}
