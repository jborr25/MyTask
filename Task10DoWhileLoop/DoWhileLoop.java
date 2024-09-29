package Task10DoWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);
    }
}
//This loop prints the numbers from 1 to 5. 
//The body of the loop is executed first, and then the condition count <= 5 is checked. Since the condition is true, the loop continues to execute until count exceeds 5.