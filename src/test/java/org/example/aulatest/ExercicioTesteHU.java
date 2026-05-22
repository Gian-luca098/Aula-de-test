package org.example.aulatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExercicioTesteHU {

    @Test
    @DisplayName("100>500=100")
    void Test(){
        Exercicio ex = new Exercicio();
        System.out.println("Exercicio valor>500 = desconto ");
        double valor = 1000;
        double expected = 900;
        Double actual = ex.Test(valor);
        assertEquals(expected,actual,()->valor+"Valor incorreto!"+expected+"!");

    }

}
