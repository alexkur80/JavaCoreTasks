package com.myproject.lection09;

import com.myproject.utils.ApplicationLogger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * This class analyze Object obj) for some hidden information like fields, methods,
 * annotations, constructors, class name, superclass name using API reflection.
 */
public class ClassAnalyzer {

    /**
     * This method analyze class structure
     *
     * @param obj acceps class object which analyse for class name, superclass name, methods, fields,
     *            constructors, annotations
     */
    public static void analizeClass(Object obj) {

// comomon class analizer
        Class clazz = obj.getClass();
        ApplicationLogger.LOGGER.info("Class info:");
        ApplicationLogger.LOGGER.info("Class: " + clazz.getName());
        ApplicationLogger.LOGGER.info("Class modifier: " + clazz.getModifiers());
        ApplicationLogger.LOGGER.info("Super Class: " + clazz.getSuperclass());
        ApplicationLogger.LOGGER.info("Super modifier: " + clazz.getModifiers());
        ApplicationLogger.LOGGER.info("");


// common methods analize
        Method[] methods = clazz.getDeclaredMethods();

        int counter01 = 0;
        ApplicationLogger.LOGGER.info("Methods:");

        for (Method method : methods) {
            ApplicationLogger.LOGGER.info("Method #" + counter01 + " " + method.getName() + " Return: " + method.getReturnType());
            counter01++;
        }
        ApplicationLogger.LOGGER.info("");


// common fields analyze
        Field[] fields = clazz.getDeclaredFields();
        int counter02 = 0;
        ApplicationLogger.LOGGER.info("Fields:");

        for (Field field : fields) {
            ApplicationLogger.LOGGER.info("Field #" + counter02 + " " + field.getName());
            counter02++;
        }
        ApplicationLogger.LOGGER.info("");


// common annotation analyze
        ApplicationLogger.LOGGER.info("Annotations:");
        int counter03 = 0;
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();

            for (Annotation annotation : annotations) {
                ApplicationLogger.LOGGER.info("Annotation #" + counter03 + " " + annotation.toString());

            }
            counter03++;
        }
        ApplicationLogger.LOGGER.info("");


// common Constructor analyze
        Constructor[] constructors = clazz.getDeclaredConstructors();
        int counter04 = 0;
        ApplicationLogger.LOGGER.info("Constructors:");

        for (Constructor constructor : constructors) {
            ApplicationLogger.LOGGER.info("Constructor #" + counter04 + " " + constructors[counter04].getName());

            counter04++;
        }
        ApplicationLogger.LOGGER.info("");

    }


    /**
     * Overloading class accepting Class clazz and do equal business logic above.
     */
    public static void analizeClass(Class clazz) {

// comomon class analizer
        ApplicationLogger.LOGGER.info("Class info:");
        ApplicationLogger.LOGGER.info("Class: " + clazz.getName());
        ApplicationLogger.LOGGER.info("Class modifier: " + clazz.getModifiers());
        ApplicationLogger.LOGGER.info("Super Class: " + clazz.getSuperclass());
        ApplicationLogger.LOGGER.info("Super modifier: " + clazz.getModifiers());
        ApplicationLogger.LOGGER.info("");


// common methods analize
        Method[] methods = clazz.getDeclaredMethods();

        int counter01 = 0;
        ApplicationLogger.LOGGER.info("Methods:");

        for (Method method : methods) {
            ApplicationLogger.LOGGER.info("Method #" + counter01 + " " + method.getName() + " Return: " + method.getReturnType());
            counter01++;
        }
        ApplicationLogger.LOGGER.info("");


// common fields analyze
        Field[] fields = clazz.getDeclaredFields();
        int counter02 = 0;
        ApplicationLogger.LOGGER.info("Fields:");

        for (Field field : fields) {
            ApplicationLogger.LOGGER.info("Field #" + counter02 + " " + field.getName());
            counter02++;
        }
        ApplicationLogger.LOGGER.info("");


// common annotation analyze
        ApplicationLogger.LOGGER.info("Annotations:");
        int counter03 = 0;
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();

            for (Annotation annotation : annotations) {
                ApplicationLogger.LOGGER.info("Annotation #" + counter03 + " " + annotation.toString());

            }
            counter03++;
        }
        ApplicationLogger.LOGGER.info("");


// common Constructor analyze
        Constructor[] constructors = clazz.getDeclaredConstructors();
        int counter04 = 0;
        ApplicationLogger.LOGGER.info("Constructors:");

        for (Constructor constructor : constructors) {
            ApplicationLogger.LOGGER.info("Constructor #" + counter04 + " " + constructors[counter04].getName());

            counter04++;
        }
        ApplicationLogger.LOGGER.info("");

    }


    /**
     * This method output message "Transaction is started" before transaction started, then
     * processing method with annotation '@Transaction' and output message "Transaction is ended".
     * This is useful to be sure method, annotated with '@Transaction' executed successfully and
     * nothing in transaction lost.
     * Alghoritm. First using Reflection API we check ckass methods of object 'Object obj'
     * Then checking if method have annotation @Transaction and if it has - it execute here: method.invoke(new Object())
     * and in for each cucle checking every methods in class that marks with @Transaction  and execute.
     *
     * @param obj class object which analyse for start and finish transaction annotation executed
     */
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



