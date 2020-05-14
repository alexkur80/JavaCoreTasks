package com.myproject.lection06;

import org.apache.log4j.Logger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Analyzes Object for some hidden information like fields, methods,
 * annotations, constructors, class name, superclass name using API reflection.
 */
public class ClassAnalyzer {
    public final static Logger LOGGER = Logger.getLogger(ClassAnalyzer.class);

    /**
     * Analyzes class structure
     *
     * @param obj acceps class object which analyse for class name, superclass name, methods, fields,
     *            constructors, annotations
     */
    public static void analyzeClass(Object obj) {
        /*  common class analyzes */

        Class clazz = obj.getClass();
        LOGGER.info("Class info:");
        LOGGER.info("Class: " + clazz.getName());
        LOGGER.info("Class modifier: " + clazz.getModifiers());
        LOGGER.info("Super Class: " + clazz.getSuperclass());
        LOGGER.info("Super modifier: " + clazz.getModifiers());
        LOGGER.info("");

        /* common methods analyzes */

        Method[] methods = clazz.getDeclaredMethods();
        LOGGER.info("Methods:");


        int methodsCounter = 0;
        for (Method method : methods) {
            LOGGER.info("Method #" + methodsCounter + " " + method.getName() + " Return: " + method.getReturnType());
            methodsCounter++;
        }

        /* common fields analyzes */

        Field[] fields = clazz.getDeclaredFields();
        LOGGER.info("Fields:");

        int fieldsCounter = 0;
        for (Field field : fields) {
            LOGGER.info("Field #" + fieldsCounter + " " + field.getName());
            fieldsCounter++;
        }

        /* common annotation of every method analyze */

        LOGGER.info("Annotations:");
        int annotationsCounter = 0;
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();

            for (Annotation annotation : annotations) {
                LOGGER.info("Annotation #" + annotationsCounter + " " + annotation.toString());
            }
            annotationsCounter++;
        }

        /* common Constructor analyze */

        Constructor[] constructors = clazz.getDeclaredConstructors();
        LOGGER.info("Constructors:");

        int constructorsCounter = 0;
        for (Constructor constructor : constructors) {
            LOGGER.info("Constructor #" + constructorsCounter + " " + constructor.getName());
            constructorsCounter++;
        }
    }

    /**
     * Overloads class accepting Class clazz and do equal business logic of analyzeClass(Object obj)
     */
    public static void analyzeClass(Class clazz) {
        /*  common class analyzer */

        LOGGER.info("Class info:");
        LOGGER.info("Class: " + clazz.getName());
        LOGGER.info("Class modifier: " + clazz.getModifiers());
        LOGGER.info("Super Class: " + clazz.getSuperclass());
        LOGGER.info("Super modifier: " + clazz.getModifiers());

        /* common methods analyze */

        Method[] methods = clazz.getDeclaredMethods();

        int methodsCounter = 0;
        LOGGER.info("Methods:");

        for (Method method : methods) {
            LOGGER.info("Method #" + methodsCounter + " " + method.getName() + " Return: " + method.getReturnType());
            methodsCounter++;
        }

        /* common fields analyzes */

        Field[] fields = clazz.getDeclaredFields();
        int fieldsCounter = 0;
        LOGGER.info("Fields:");

        for (Field field : fields) {
            LOGGER.info("Field #" + fieldsCounter + " " + field.getName());
            fieldsCounter++;
        }

        /* common annotation of every method analyze */

        LOGGER.info("Annotations:");

        int annotationsCounter = 0;
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();

            for (Annotation annotation : annotations) {
                LOGGER.info("Annotation #" + annotationsCounter + " " + annotation.toString());
            }
            annotationsCounter++;
        }

        /* common Constructor analyze */

        Constructor[] constructors = clazz.getDeclaredConstructors();
        LOGGER.info("Constructors:");

        int constructorsCounter = 0;
        for (Constructor constructor : constructors) {
            LOGGER.info("Constructor #" + constructorsCounter + " " + constructor.getName());

            constructorsCounter++;
        }
    }


    /**
     * Outputs message "Transaction is started" before transaction started, then
     * processing method with annotation '@Transaction' and output message "Transaction is ended".
     * This is useful to be sure method, annotated with '@Transaction' executed successfully and
     * nothing in transaction lost.
     * Algorithm: First using Reflection API we check ckass methods of object 'Object obj'
     * Then checking if method have annotation @Transaction and if it has - it execute here: method.invoke(new Object())
     * and in for each cucle checking every methods in class that marks with @Transaction  and execute .
     *
     * @param obj class object which analyse for start and finish transaction annotation executed
     */
    public static void transactionSuccessVerification(Object obj) {
        Class clazz = obj.getClass();

        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Transaction) {
                    LOGGER.info("Transaction is started");
                    try {
                        method.invoke(new Object());

                    } catch (IllegalAccessException e) {
                        LOGGER.error(e);
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } finally {
                        LOGGER.info("Transaction is ended");
                    }

                }
            }
        }
    }
}