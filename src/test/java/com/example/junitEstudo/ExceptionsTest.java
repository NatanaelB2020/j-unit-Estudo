package com.example.junitEstudo;

import com.example.junitEstudo.pessoa.Conta;
import com.example.junitEstudo.pessoa.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456789", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
