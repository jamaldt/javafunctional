package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

/**
 * System:                 CleanBnB
 * Name:                   StringFunctions
 * Description:            Class that represents a StringFunctions's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/11/21
 */
public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Hola Estudiante de platzi!"));

        System.out.println(addMark.apply("Hola"));

        BiFunction<String, Integer, String> leftPad =
            (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));
    }
}