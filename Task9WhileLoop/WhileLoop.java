package Task9WhileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 5) {
            System.out.println("Count: " + x);
            x++;
        }
    }
}
//This loop prints the numbers from 1 to 5. The condition x <= 5 is checked before each iteration, and the count variable is incremented in each iteration.
//An expression that is evaluated before each iteration. If it's true, the loop continues; otherwise, it terminates.