package org.example.aulatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2*")

    void TestSoma(){
        System.out.println("Teste 6.2 + 2 = 8.2*");
        //AAA Arrange,Act,Assert

        double firstNumber = 6.2;
        double secondNumber = 2;
        double expected = 8.2;

        //When/Act
        Double actual = math.sum(firstNumber,secondNumber);
        //Then
        assertEquals(expected,actual,
                ()->firstNumber+"+"+secondNumber+"Valor incorreto!"+expected+"!");
    }

    @Test
    @DisplayName("multplicacao")
    void TestMult(){
        System.out.println("Teste 6 * 5 = 30*");
        double firstNumber = 6;
        double secondNumber = 5;
        double expected = 30;

        Double actual = math.multplication(firstNumber,secondNumber);
        assertEquals(expected,actual,()->firstNumber+"*"+secondNumber+"Valor incorreto!"+expected+"!");

    }


}
