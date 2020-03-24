package com.myproject.lection09;

import com.myproject.utils.ApplicationLogger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
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
        ApplicationLogger.LOGGER.info("Class: " + clazz.getName());
        ApplicationLogger.LOGGER.info("Class modifier: " + clazz.getModifiers());
        ApplicationLogger.LOGGER.info("Super Class: " + clazz.getSuperclass());
        ApplicationLogger.LOGGER.info("Super modifier: " + clazz.getModifiers());


// common methods analize
        Method[] methods = clazz.getDeclaredMethods();

        int i = 0;
        for (Method method : methods) {
            ApplicationLogger.LOGGER.info("Method #" + i + " " + method.getName() + " Return: " + method.getReturnType());
            i++;
        }


// common annotation analyze
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                ApplicationLogger.LOGGER.info("Annotation" + annotation.toString());

            }
        }


// common Constructor analyze
        Constructor[] constructors = clazz.getDeclaredConstructors();
        int j = 0;
        for (Constructor constructor : constructors) {
            ApplicationLogger.LOGGER.info("Constructor #" + i + " " + constructors[j].getName());

            i++;
        }

    }


    /**
     * This method output message "Transaction is started" before transaction started, then
     * procrssing method with annotation '@Transaction' and output message "ransaction is ended".
     * This is useful to be sure method, annotated with '@Transaction' executed sucessfully and
     * nothing in transaction lost.
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



