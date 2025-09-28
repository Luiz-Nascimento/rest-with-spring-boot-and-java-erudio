package br.com.luiz.util;

import br.com.luiz.exception.UnsupportedMathOperationException;

public class NumericString {

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException{
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value");;
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }


}
