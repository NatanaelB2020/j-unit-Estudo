package com.example.junitEstudo;

import com.example.junitEstudo.pessoa.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
//Importação statica do Assertions
import static org.junit.jupiter.api.Assertions.*;



public class AssertionsTest {

    @Test
    void validarLancementos() {

        int[] primeiroLancemento = {10, 20, 30, 40, 50};
        int[] segundoLancemento = {10, 20, 0, 4, 5};

        assertNotEquals(primeiroLancemento, segundoLancemento);
//        Sem usar a importação statica
//        Assertions.assertArrayEquals(primeiroLancemento, segundoLancemento);
    }
    @Test
    void validarSeObjetoEstanulo() {

        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Heloisa", LocalDate.now());
        assertNotNull(pessoa);

    }

    @Test
    void validarNumerosTiposdiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }

}
