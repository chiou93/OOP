package Javacalc;


public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int numer = (numerator * other.denominator) + (other.numerator * denominator);
        int denom = denominator * other.denominator;
        return new RationalNumber(numer, denom);
    }

    public RationalNumber subtract(RationalNumber other) {
        int numer = (numerator * other.denominator) - (other.numerator * denominator);
        int denom = denominator * other.denominator;
        return new RationalNumber(numer, denom);
    }

    public RationalNumber multiply(RationalNumber other) {
        int numer = numerator * other.numerator;
        int denom = denominator * other.denominator;
        return new RationalNumber(numer, denom);
    }

    public RationalNumber divide(RationalNumber other) {
        int numer = numerator * other.denominator;
        int denom = denominator * other.numerator;
        return new RationalNumber(numer, denom);
    }

    public int compareTo(RationalNumber other) {
        int thisValue = numerator * other.denominator;
        int otherValue = other.numerator * denominator;
        return Integer.compare(thisValue, otherValue);
    }
}
