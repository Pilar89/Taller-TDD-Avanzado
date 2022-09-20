package co.com.sofka.app.stringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    public StringCalculator stringCalculator = new StringCalculator();


    //Una cadena vacía devuelve cero
    @Test
    public void cadenaVaciaTest() throws Exception {
        assertEquals(stringCalculator.add(""), 0);
    }

    //Un solo número devuelve el valor

    @Test
    public void unicoValorTest() throws Exception {
        assertEquals(stringCalculator.add("1"), 1);
        assertNotEquals(stringCalculator.add("2"), 1);
    }

    //Dos números, delimitados por comas, devuelven la suma

    @Test
    public void dosNumerosDelimitadosPorComasTest() throws Exception {
        assertEquals(stringCalculator.add("1,1"), 2);
        assertEquals(stringCalculator.add("2,4,"), 6);
    }

    //Dos números, delimitados por saltos de línea, devuelve la suma

    @Test
    public void dosNumerosDelimitadosPorSaltoDeLineaTest() throws Exception {
        assertEquals(stringCalculator.add("0\n2"), 2);
        assertEquals(stringCalculator.add("1\n1"), 2);
        assertEquals(stringCalculator.add("1\n2"), 3);
    }

    //Tres números, delimitados de cualquier manera, devuelven la suma

    @Test

    public void tresNumerosDelimitadosDeCualquierManeraTest() throws Exception {
        assertEquals(stringCalculator.add("1\n2,3"), 6);
        assertEquals(stringCalculator.add("1,2\n4"), 7);

    }

    //Los números superiores a 1000 se ignoran

    @Test

    public void numeroSuperioresA100Test() throws Exception {
        assertEquals(stringCalculator.add("2,1000"), 1002);
        assertEquals(stringCalculator.add("2,1001"), 2);

    }

    @Test

    //Se puede definir un solo delimitador
    public void unSoloDelimitadorTest() throws Exception {
        assertEquals(stringCalculator.add("#2#1000"), 1002);


    }




















}