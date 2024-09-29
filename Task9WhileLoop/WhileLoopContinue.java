package Task9WhileLoop;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            count++;
            if (count % 2 == 0) {
                continue;   // Skip even numbers
            }
            System.out.println("Odd number: " + count);
        }
    }
}
//This loop prints odd numbers from 1 to 9. The continue statement skips the even numbers.