package com.platzi.functional._04_functional;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * System:                 CleanBnB
 * Name:                   MathFunctions
 * Description:            Class that represents a MathFunctions's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/11/21
 */
public class MathFunctions
{
    public static void main(String[] args)
    {
        //System.out.println("hola jamal");
        Function<Integer,Integer > square = new Function<Integer, Integer>()
        {
            @Override
            public Integer apply(Integer x)
            {
                return x * x;
            }
        };
        System.out.println(square.apply(5));
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        Predicate<Integer> isEven = x -> x % 2 == 1;

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;
        Student jamal = new Student(5.9);
        System.out.println(isApproved.test(jamal));

    }

    static class Student {
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }

}
