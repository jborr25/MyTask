package Task10DoWhileLoop;

public class DoWhileLoopBreak {
    public static void main(String[] args) {
        int count = 0;
do {
    System.out.println("Count: " + count);
    count++;

    if (count >= 10) {
        break; // Terminate the loop
    }
} while (true);
    }
}
//the loop will continue indefinitely until the break statement is executed when count reaches 10, even though the initial condition is true