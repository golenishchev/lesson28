package com.example.lesson28;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationReflection {
    public void parseAnnotation() {
        Class c = AnnotationTest.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getName());
            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Parameter Type: ");
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName());
            }
            System.out.println();
            Annotation[] annotations = method.getAnnotations();
            System.out.print("Annotation:");
            for (Annotation annotation : annotations) {
                System.out.print(" @" + annotation.annotationType().getSimpleName());
            }
            System.out.println("\n");
        }
    }
}
