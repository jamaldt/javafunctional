package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.Function;

/**
 * System:                 CleanBnB
 * Name:                   Inferencia
 * Description:            Class that represents a Inferencia's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/11/21
 */
public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora =
            x -> "Al doble:" + (x * 2) ;

        List<String> alumnos = NombresUtils.getList("Hugo", "Paco", "Luis");
        alumnos.forEach((String name) -> System.out.println(name));
        alumnos.forEach(name -> System.out.println(name));
        alumnos.forEach(System.out::println);
    }
}