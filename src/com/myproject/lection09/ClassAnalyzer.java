package com.myproject.lection09;

import com.myproject.utils.ApplicationLogger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassAnalyzer {


    public static void showClassName(Object obj) {

        Class clazz = obj.getClass();
        ApplicationLogger.LOGGER.info("Class: " + clazz.getName());
        ApplicationLogger.LOGGER.info("Super Class: " + clazz.getSuperclass());
    }

    // Overloading showClassName method
    public static void showClassName(Class clazz) {
        ApplicationLogger.LOGGER.info("Class: " + clazz.getName());
    }

    public static void showClassFields(Object obj) {
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        int i = 0;
        for (Field field : fields) {
            ApplicationLogger.LOGGER.info("Field #" + i + " " + field.getName() + field.getType());
            i++;
        }

    }


    public static void showClassMethods(Object obj) {
        Class clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        int i = 0;
        for (Method method : methods) {
            ApplicationLogger.LOGGER.info("Method #" + i + " " + method.getName() + " Return: " + method.getReturnType());
            i++;
        }
    }


    // Overloading showClassMethods method
    public static void showClassMethods(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();

        int i = 0;
        for (Method method : methods) {
            ApplicationLogger.LOGGER.info("Method #" + i + " " + method.getName());
            i++;
        }
    }


    public static void showMethodsAnnotations(Object obj) {
        Class clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                ApplicationLogger.LOGGER.info("Annotation" + annotation.toString());

            }
        }

    }

    // Overloading showMethodsAnnotations method
    public static void showMethodsAnnotations(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
            }
        }

    }


    public static void showClassConstructors(Object obj) {
        Class clazz = obj.getClass();
        Constructor[] constructors = clazz.getDeclaredConstructors();
        int i = 0;
        for (Constructor constructor : constructors) {
           //ApplicationLogger.LOGGER.info ("Constructor #" + i + " " + constructors[i].getParameterTypes().toString() + constructors[i].getName());
            ApplicationLogger.LOGGER.info ("Constructor #" + i + " " + constructors[i].getName());

            i++;
        }

      //  Class[] parameterTypes = constructor.getParameterTypes();

    }


    // Overloading showClassConstructors method
    public static void showClassConstructors(Class clazz) {
        Constructor[] constructors = clazz.getDeclaredConstructors();
        int i = 0;
        for (Constructor constructor : constructors) {
        //  ApplicationLogger.LOGGER.info("Constructor " + constructor.);
            i++;
        }
        System.out.println("Конструкторы класса: " + Arrays.toString(clazz.getConstructors()));
    }


    public static void transactionSuccessVerification(Object obj) {
        Class clazz = obj.getClass();

        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (true) {
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Transaction) {
                        ApplicationLogger.LOGGER.info("Transaction is started");
                        try {
                            method.invoke(new Object());

                        } catch (IllegalAccessException e) {
                            e.printStackTrace();

                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                        ApplicationLogger.LOGGER.info("Transaction is ended");
                    }

                }
            }

        }
    }
}



