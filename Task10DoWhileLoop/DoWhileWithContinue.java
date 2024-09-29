package Task10DoWhileLoop;

public class DoWhileWithContinue {
    public static void main(String[] args) {
        int count = 0;
        do {
            count++;
            if (count % 2 == 0) {
                continue;
            }
            System.out.println("Odd number: " + count);
        } while (count<10);
    }
}
//This loop prints odd numbers from 1 to 9. The continue statement skips the even numbers.