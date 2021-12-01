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
        List<String> resultado = fizzBuzz.run(1);

        // comprobamos
        Assertions.assertEquals(1, resultado.size());
        Assertions.assertTrue("1".equals(resultado.get(0)));
    }

    @Test
    public void testSiLePasoUn2Devuelve1y2(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(2);

        // comprobamos 1,2
        Assertions.assertEquals(2, resultado.size());
        Assertions.assertTrue("1".equals(resultado.get(0)));
        Assertions.assertTrue("2".equals(resultado.get(1)));
    }

    @Test
    public void testSiLePasoUn3Devuelve1y2y3(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(3);

        // comprobamos 1,2
        Assertions.assertEquals(3, resultado.size());
        Assertions.assertTrue("1".equals(resultado.get(0)));
        Assertions.assertTrue("2".equals(resultado.get(1)));
        Assertions.assertTrue("Fizz".equals(resultado.get(2)));
    }

    @Test
    public void testSiLePasoUn100DevuelveTodos(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(100);

        // comprobamos
        Assertions.assertEquals(100, resultado.size());
        Assertions.assertTrue("1".equals(resultado.get(0)));
        Assertions.assertTrue("2".equals(resultado.get(1)));
        Assertions.assertTrue("Fizz".equals(resultado.get(2)));

        Assertions.assertTrue("Buzz".equals(resultado.get(resultado.size() - 1)));

    }

    @Test
    public void testSiElNumeroEsTresPintaFizz(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(3);

        // comprobamos
        Assertions.assertEquals(3, resultado.size());
        Assertions.assertEquals("Fizz", resultado.get(2));
    }

    @Test
    public void testSiElNumeroEsSeisPintaFizz(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(6);

        // comprobamos
        Assertions.assertEquals(6, resultado.size());
        Assertions.assertEquals("Fizz", resultado.get(5));
    }

    @Test
    public void testSiElNumeroEsNuevePintaFizz(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(9);

        // comprobamos
        Assertions.assertEquals(9, resultado.size());
        Assertions.assertEquals("Fizz", resultado.get(8));
    }

    @Test
    public void testSiElNumeroEs50PintaBuzz(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(5);

        // comprobamos
        Assertions.assertEquals(5, resultado.size());
        Assertions.assertEquals("Buzz", resultado.get(4));
    }

    @Test
    public void testSiElNumeroEs150PintaFizzBuzz(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(15);

        // comprobamos
        Assertions.assertEquals(15, resultado.size());
        Assertions.assertEquals("FizzBuzz", resultado.get(14));
    }

    @Test
    public void testSiElNumeroEs90PintaFizzBuzz(){
        // preparamos
        FizzBuzz fizzBuzz = new FizzBuzz();

        // ejecutamos
        List<String> resultado = fizzBuzz.run(90);

        // comprobamos
        Assertions.assertEquals(90, resultado.size());
        Assertions.assertEquals("FizzBuzz", resultado.get(89));
    }
}
