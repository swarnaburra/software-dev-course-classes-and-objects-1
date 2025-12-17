package org.example;

import org.junit.Test;

public class CalculatorTests {
    @Test
    public void testAdd() {
        assert Calculator.add(1, 2) == 3;
        assert Calculator.add(0, 0) == 0;
        assert Calculator.add(-1, -1) == -2;
    }

    @Test
    public void testSubtract() {
        assert Calculator.difference(1, 2) == -1;
        assert Calculator.difference(0, 0) == 0;
        assert Calculator.difference(-1, -1) == 0;
    }

    @Test
    public void testMultiply() {
        assert Calculator.product(1, 2) == 2;
        assert Calculator.product(0, 0) == 0;
        assert Calculator.product(-1, -1) == 1;
    }

    @Test
    public void testDivide() {
        assert Calculator.divide(8, 2) == 4;
        assert Calculator.divide(0, 1) == 0;
        assert Calculator.divide(-1, -1) == 1;
    }
}
