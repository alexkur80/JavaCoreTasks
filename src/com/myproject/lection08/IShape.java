/**
 * This Interface have two methods that should be implemented at any classes that
 * implements this Interface.
 *
 * @param double area() - Overriding method calculate area of Rectangle and return area, type double
 * @param String toString() - Overriding method informing you are inside Rectangle class.
 * @author Kurlovich Alexander
 * @version Lection08 Polymorphism
 */

package com.myproject.lection08;

interface IShape {

    double area();

    String toString();
}

