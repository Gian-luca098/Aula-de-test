package org.example.aulatest;

public class Filme {

    public String FilmeFaixaEtaria(int idade, String faixaEtaria) {
        if (idade == 18 && faixaEtaria == "18" || faixaEtaria == "L") {
            return "permitido";
        } else {
            return "nao permitido";
        }

    }
}