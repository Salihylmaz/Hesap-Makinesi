package com.sa.hesapmakinesi;
import org.mariuszgromada.math.mxparser.Expression;

public class deneme {
    public static double calculate(String expression) {
        Expression expr = new Expression(expression);
        return expr.calculate();
    }
}
