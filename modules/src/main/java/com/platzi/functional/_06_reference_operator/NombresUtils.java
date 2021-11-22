package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * System:                 CleanBnB
 * Name:                   NombresUtils
 * Description:            Class that represents a NombresUtils's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/11/21
 */
public class NombresUtils {
    public static void main(String[] args) {
        List<String> profesores = getList("Nicolas", "Juan", "Zulema");

        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);
        System.out.println("//////////");
        profesores.forEach(System.out::println);
    }

    public static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }
}