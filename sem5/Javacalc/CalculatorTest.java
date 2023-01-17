package Javacalc;


public class CalculatorTest {

    @Test
    public void testAddRational() {
        RationalNumber a = new RationalNumber(1, 2);
        RationalNumber b = new RationalNumber(3, 4);
        RationalNumber expected = new RationalNumber(5, 4);
        RationalNumber result = Calculator.add(a, b);
        assertEquals(expected, result);
    }

    private void assertEquals(RationalNumber expected, RationalNumber result) {
    }

    @Test
    public void testSubtractRational() {
        RationalNumber a = new RationalNumber(3, 4);
        RationalNumber b = new RationalNumber(1, 2);
        RationalNumber expected = new RationalNumber(1, 4);
        RationalNumber result = Calculator.subtract(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiplyRational() {
        RationalNumber a = new RationalNumber(1, 2);
        RationalNumber b = new RationalNumber(3, 4);
        RationalNumber expected = new RationalNumber(3, 8);
        RationalNumber result = Calculator.multiply(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testDivideRational() {
        RationalNumber a = new RationalNumber(3, 4);
        RationalNumber b = new RationalNumber(2, 3);
        RationalNumber expected = new RationalNumber(9, 8);
        RationalNumber result = Calculator.divide(a, b);
        assertEquals(expected, result);
    }
}
