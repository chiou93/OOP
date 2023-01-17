package Javacalc;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calculator {

    public static RationalNumber add(RationalNumber a, RationalNumber b) {
        RationalNumber result = a.add(b);
        log("add", a, b, result);
        return result;
    }

    public static RationalNumber subtract(RationalNumber a, RationalNumber b) {
        RationalNumber result = a.subtract(b);
        log("subtract", a, b, result);
        return result;
    }

    public static RationalNumber multiply(RationalNumber a, RationalNumber b) {
        RationalNumber result = a.multiply(b);
        log("multiply", a, b, result);
        return result;
    }

    public static RationalNumber divide(RationalNumber a, RationalNumber b) {
        RationalNumber result = a.divide(b);
        log("divide", a, b, result);
        return result;
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.add(b);
        log("add", a, b, result);
        return result;
    }

    public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.subtract(b);
        log("subtract", a, b, result);
        return result;
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.multiply(b);
        log("multiply", a, b, result);
        return result;
    }

    public static ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.divide(b);
        log("divide", a, b, result);
        return result;
    }

    private static void log(String operation, Object a, Object b, Object result) {
        String input = a + " " + operation + " " + b;
        String output = result.toString();
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        try {
            File file = new File("calculator.log");
            FileWriter fw = new FileWriter(file, true);
            fw.write(date + " - " + input + " = " + output + System.lineSeparator());
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}
