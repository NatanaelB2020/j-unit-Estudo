package com.example.junitEstudo;

import com.example.junitEstudo.pessoa.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validaCaculoIdade(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2000,1, 1));
        Assertions.assertEquals(23, pessoa.getIdade());

    }
    @Test
    void deveRetornaSeMaior(){
        Pessoa pessoa = new Pessoa("Natanael", LocalDate.of(1987,9,13));
        Assertions.assertTrue(pessoa.maiorDeIdade());
        Pessoa natan = new Pessoa("Natanael", LocalDate.now());
        Assertions.assertFalse(natan.maiorDeIdade());
    }
}
