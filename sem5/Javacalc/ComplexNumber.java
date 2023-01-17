package Javacalc;


public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double real = this.real + other.real;
        double imaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double real = this.real - other.real;
        double imaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = (other.real * other.real) + (other.imaginary * other.imaginary);
        double real = ((this.real * other.real) + (this.imaginary * other.imaginary)) / divisor;
        double imaginary = ((this.imaginary * other.real) - (this.real * other.imaginary)) / divisor;
        return new ComplexNumber(real, imaginary);
    }

    public int compareTo(ComplexNumber other) {
        double thisValue = Math.sqrt(real*real + imaginary*imaginary);
        double otherValue = Math.sqrt(other.real*other.real + other.imaginary*other.imaginary);
        return Double.compare(thisValue, otherValue);
    }
}
