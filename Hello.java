/*
Primitive data types in Java are predefined by the Java language and named
as the reserved keywords. A primitive data type does not share a state with
other primitive values. Java programming language supports the following eight
primitive data types.

        Boolean data type
        byte data type
        int data type
        long data type
        float data type
        double data type
        char data type
        short data type
*/


public class Hello {
    public static void main(String[] args) {
        // Primitive Datatypes => Integers
        int intVariable = 33;
        byte byteVariable = 122;
        short shortVariable = 333;
        long longVariable = 3333333333l;

        System.out.println("Int variable " + intVariable);
        System.out.println("Byte variable " + byteVariable);
        System.out.println("Short variable " + shortVariable);
        System.out.println("Long variable " + longVariable);

        // Primitive Datatypes => Floating
        float floatVariable = 123.2f;
        double doubleVariable = 222222.333333333333;
        System.out.println("Float variable " + floatVariable);
        System.out.println("Double variable " + doubleVariable);

        // Primitive Datatypes => Boolean
        boolean booleanVariable = true;
        System.out.println("Boolean variable" + booleanVariable);

        // Primitive Datatypes => Char
        char charVariable = 'A';
        System.out.println("Char variable" + charVariable);

    }
}
