package Fundamentos.solved.classesTeste;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LittleHelperFunctions {

    public LittleHelperFunctions() {
    }

    public static UnaryOperator<String> binario = s -> Integer.toBinaryString(Integer.parseInt(s));
    public static UnaryOperator<String> inverterString = s -> new StringBuilder(s).reverse().toString();
    public static Function<String, Integer> convertToInt = s -> Integer.parseInt(s, 2);
}
