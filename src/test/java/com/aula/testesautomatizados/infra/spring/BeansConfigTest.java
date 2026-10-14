package com.aula.testesautomatizados.infra.spring;

import com.aula.testesautomatizados.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BeansConfigTest {

    @Test
    void deveRegistrarCalculadoraNoContextoSpring() {
        try (var contexto =
                     new AnnotationConfigApplicationContext(BeansConfig.class)) {

            CalculadoraService calculadora =
                    contexto.getBean(CalculadoraService.class);

            assertNotNull(calculadora);
            assertEquals(5, calculadora.somar(2, 3));
        }
    }
}
