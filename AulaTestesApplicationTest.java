package com.aula.testesautomatizados;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.mockStatic;

class AulaTestesApplicationTest {

    @Test
    void deveIniciarAplicacaoPeloSpring() {
        String[] argumentos = {};

        try (MockedStatic<SpringApplication> spring =
                     mockStatic(SpringApplication.class)) {

            AulaTestesApplication.main(argumentos);

            spring.verify(() ->
                    SpringApplication.run(
                            AulaTestesApplication.class,
                            argumentos
                    )
            );
        }
    }
}