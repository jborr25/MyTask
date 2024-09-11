public class Arith{
public static void main(String[] args) {
   int A = 10;
   int B = 5;
   int C = 0;
   int D = 22;
   int E = 5;
   int F = 10;

   int Sum = A+B; 
   int Difference = A-B;
   int Product = A*B;
   int Qoutient = A/B;
   int Remainder = D%E; //The modulus operator returns the remainder when the first operand is divided by the second.
   ++C; //The increment operator increases the value of an operand by 1. It can be used as a prefix (++a) or a suffix (a++).
   --F;

System.out.println("Sum: "+ Sum);
System.out.println("Difference: "+ Difference);
System.out.println("Product: "+ Product);
System.out.println("Qoutient: " + Qoutient);
System.out.println("Remainder: " + Remainder);
System.out.println("Prefix Increment: " + C);
System.out.println("Prefix Decrement: " + F);

    }
}