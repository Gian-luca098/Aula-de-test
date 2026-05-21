package org.example.aulatest;

public class Exercicio {


    public static double Test(Double valor, Double desconto,Double valorFinal){

        if (valor>500){
            desconto = valor*0.1;
            valorFinal = valor-desconto;
        }



        if (valor>500){
            return valorFinal;

        }else {
            return valor;

        }

    }
}
