package org.example.aulatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExercicioTesteHU {

    @Test
    @DisplayName("100>500=100")
    void Test(){
        System.out.println("Exercicio valor>500 = desconto ");
        double valor = 100;

        double expected = 100;

        Double actual = Exercicio.Test(valor,valorFinal);
        assertEquals(expected,actual,()->"Valor incorreto!"+expected+"!");

    }

}
