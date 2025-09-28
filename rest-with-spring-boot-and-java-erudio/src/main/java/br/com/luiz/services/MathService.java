package br.com.luiz.services;

import br.com.luiz.exception.UnsupportedMathOperationException;
import br.com.luiz.util.NumericString;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double sum(String a, String b) {
        if(!NumericString.isNumeric(a) || !NumericString.isNumeric(b)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return NumericString.convertToDouble(a) + NumericString.convertToDouble(b);
    }

    public Double minus(String a, String b) {
        if(!NumericString.isNumeric(a) || !NumericString.isNumeric(b)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return NumericString.convertToDouble(a) - NumericString.convertToDouble(b);
    }

    public Double multiply(String a, String b) {
        if(!NumericString.isNumeric(a) || !NumericString.isNumeric(b)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return NumericString.convertToDouble(a) * NumericString.convertToDouble(b);
    }

    public Double divide(String a, String b) {
        if (!NumericString.isNumeric(a) || !NumericString.isNumeric(b)) throw new UnsupportedMathOperationException("Please set a numeric value");
        if (a.equals("0") || b.equals("0")) throw new UnsupportedMathOperationException("Division by zero not supported");

        return NumericString.convertToDouble(a) / NumericString.convertToDouble(b);
    }

    public Double average(String a, String b) {
        if(!NumericString.isNumeric(a) || !NumericString.isNumeric(b)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return (NumericString.convertToDouble(a) + NumericString.convertToDouble(b)) / 2;
    }

    public Double sqroot(String x) {
        if (!NumericString.isNumeric(x)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return Math.sqrt(NumericString.convertToDouble(x));
    }

}
