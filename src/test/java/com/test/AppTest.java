package com.test;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void CalculatorTests() {
        Calculator calculator = new Calculator();


        //  assertEquals(7.0, sum, "Sum is incorrect");



        double multiply = calculator.getMultiply(5.0, 3.0);
        assertEquals(15.0, multiply, "Multipy is incorrect");

        double division = calculator.getDivision(15.0, 3.0);
        assertEquals(5.0, division, "Division is incorrect");
    }

    @Test
    public void SumValidationTest()
    {   Calculator calculator = new Calculator();
        double sum = calculator.getSum(2.0, 8.0);
        assertEquals(7.0, sum, "Sum is incorrect");
    }

    @Test
    public void SubstractionTest()
    {   Calculator calculator = new Calculator();
        double substraction = calculator.getSubstraction(5.0, 3.0);
        assertEquals(2.0, substraction, "Distruction is incorrect");
    }

    }

