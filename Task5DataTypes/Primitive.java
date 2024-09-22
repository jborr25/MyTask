package Task5DataTypes;

public class Primitive {
    public static void main(String[] args) {

        byte b = -128; //The byte data types is a 8-bit signed two's complement integer. minimum value of -128 and a maximum value of 127 (inclusive)
        short s = 10000; //The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
        int i = 100000; //The int data type is a 32-bit signed two's complement integer. It has a minimum value of -2^31 and a maximum value of 2^31 - 1 (inclusive).
        long l = 100000L; //The long data type is a 64-bit signed two's complement integer. It has a minimum value of -2^63 and a maximum value of 2^63 - 1 (inclusive).
        float f = 10.5f; //The float data type is a single-precision 32-bit IEEE 754 floating point. It is mainly used to save memory in large arrays of floating point numbers.
        double d = 10.5; //The double data type is a double-precision 64-bit IEEE 754 floating point. For decimal values, this data type is generally the default choice.
        char c = 'A'; //The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
        boolean bool = true; //The boolean data type has only two possible values: true and false. This data type is used for simple flags that track true/false conditions.

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + bool);




    }
}