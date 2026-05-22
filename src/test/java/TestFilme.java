
import org.example.aulatest.Filme;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFilme {

    @Test
    void Test(){
        Filme filme = new Filme();
        System.out.println("Exercicio Faixa etaria ");
        int idade = 16;
        String faixaEtaria ="L";
         String expected = "permitido";


        String actual = filme.FilmeFaixaEtaria(idade,faixaEtaria);
        assertEquals(expected,actual,()->expected+"!");
        System.out.println("Exercicio Faixa etaria Resposta do sistema:"+expected);
}
}
