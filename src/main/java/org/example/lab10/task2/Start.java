package org.example.lab10.task2;

import java.lang.reflect.*;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) throws Exception {
        int[] grades = {85, 90, 88, 92};
        Student student = new Student("Lazar Matic", "1111", grades);

        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(grades);


        System.out.println("Reflection on Student class:");
        printFieldsAndValues(student);
        System.out.println("\nReflection on GradeAnalyzer class:");
        printFieldsAndValues(gradeAnalyzer);

        System.out.println("\nReflection on methods:");
        invokeMethods(student);
        invokeMethods(gradeAnalyzer);
    }

    private static void printFieldsAndValues(Object obj) throws IllegalAccessException {
        Class<?> klasa = obj.getClass();
        Field[] fields = klasa.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(obj);
            if (value instanceof int[]) {
                System.out.println("Field: " + field.getName() + ", Value: " + Arrays.toString((int[]) value));
            } else {
                System.out.println("Field: " + field.getName() + ", Value: " + value);
            }
        }
    }


    private static void invokeMethods(Object obj) throws Exception {
        Class<?> klasa = obj.getClass();
        Method[] methods = klasa.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                method.setAccessible(true);
                if (method.getReturnType().equals(void.class)) {
                    method.invoke(obj);
                    System.out.println("Invoked method: " + method.getName());
                } else {
                    Object result = method.invoke(obj);
                    System.out.println("Invoked method: " + method.getName() + ", Result: " + result);
                }
            }
        }
    }
}
