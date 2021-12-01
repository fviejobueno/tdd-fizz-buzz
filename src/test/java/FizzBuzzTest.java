import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzTest {


    @Test
    public void testSiLePasoUn1Devuelve1(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<Integer> resultado = fizzBuzz.run(1);

        // comprobamos
        Assertions.assertEquals(1, resultado.size());
        Assertions.assertTrue(1 == resultado.get(0));
    }

    @Test
    public void testSiLePasoUn2Devuelve1y2(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<Integer> resultado = fizzBuzz.run(2);

        // comprobamos 1,2
        Assertions.assertEquals(2, resultado.size());
        Assertions.assertTrue(1 == resultado.get(0));
        Assertions.assertTrue(2 == resultado.get(1));
    }

    @Test
    public void testSiLePasoUn3Devuelve1y2y3(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<Integer> resultado = fizzBuzz.run(3);

        // comprobamos 1,2
        Assertions.assertEquals(3, resultado.size());
        Assertions.assertTrue(1 == resultado.get(0));
        Assertions.assertTrue(2 == resultado.get(1));
        Assertions.assertTrue(3 == resultado.get(2));
    }

    @Test
    public void testSiLePasoUn100DevuelveTodos(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<Integer> resultado = fizzBuzz.run(100);

        // comprobamos 1,2
        Assertions.assertEquals(100, resultado.size());
        Assertions.assertTrue(1 == resultado.get(0));
        Assertions.assertTrue(2 == resultado.get(1));
        Assertions.assertTrue(3 == resultado.get(2));

        Assertions.assertTrue(100 == resultado.get(resultado.size() - 1));

    }
}
