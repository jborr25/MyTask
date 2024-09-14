package Task4Operators;

public class Equality {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
    if (x==y) 
        System.out.println("EQUAL"); //Tests for equality. Returns true if the values on both sides are equal.
    if (x!=y) 
        System.out.println("NOT EQUAL"); //Tests for inequality. Returns true if the values on both sides are not equal.
    }   

}
/*
 * When comparing floating-point numbers (float or double), use the equals() method instead of the == operator to avoid precision issues.
 * The == operator compares references for objects. To compare the contents of objects, use the equals() method.
 */