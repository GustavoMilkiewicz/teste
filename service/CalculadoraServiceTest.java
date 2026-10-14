package com.aula.testesautomatizados.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraServiceTest {

    private final CalculadoraService calculadoraService =
            new CalculadoraService();

    @Test
    void deveSomarDoisNumeros() {
        assertEquals(5, calculadoraService.somar(2, 3));
    }

    @Test
    void deveSubtrairDoisNumeros() {
        assertEquals(-2, calculadoraService.subtrair(3, 5));
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        assertEquals(12, calculadoraService.multiplicar(4, 3));
    }

    @Test
    void deveDividirDoisNumeros() {
        assertEquals(5.0, calculadoraService.dividir(10, 2), 0.000001);
    }

    @Test
    void deveDividirComResultadoFracionario() {
        assertEquals(2.5, calculadoraService.dividir(5, 2), 0.000001);
    }

    @Test
    void deveRejeitarDivisaoPorZero() {
        IllegalArgumentException erro = assertThrows(
                IllegalArgumentException.class,
                () -> calculadoraService.dividir(10, 0)
        );

        assertEquals(
                "Divisão por zero não é permitida.",
                erro.getMessage()
        );
    }
}