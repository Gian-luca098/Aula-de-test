package org.example.aulatest;


import org.junit.jupiter.api.*;

@DisplayName(("Teste de Matematica Operaçao Simples"))
public class MatematicaSimplesTest {
    MatematicaSimples math;
    @BeforeAll
    static void setup() {
        System.out.println("Escrevendo antes do metodo");
    }


    @AfterAll
    static void cleanup() {
        System.out.println("Escrevendo depois do metodo");
    }
    @BeforeEach
    void BeforeEachMethod() {
        math = new MatematicaSimples();
        System.out.println("escrevendo metodo antes da linha");
    }
    @AfterEach
    void AfterEachMethod() {
        math = new  MatematicaSimples();
        System.out.println("escrevendo metodo depois da linha");
    }



}
