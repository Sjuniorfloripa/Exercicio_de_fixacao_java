package Fundamentos.solved;

import Fundamentos.solved.classesTeste.LittleHelperFunctions;

import java.util.Arrays;
import java.util.List;

public class Ex042 {
    // Desafio: 1. Número para string binária... 6 => "110"
    //          2. Inverter a String... "110" => "011"
    //          3. Converter de volta para inteiro => "011" => 3

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(LittleHelperFunctions.inverterString)
                .map(LittleHelperFunctions.convertToInt)
                .forEach(System.out::println);
    }
}
