package Task9WhileLoop;

public class WhileLoopBreak {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            System.out.println("Count: " + count);
            count++;

            if (count == 10) {
                break;
            }
            
        }
    }
}
//the loop will terminate when the count reaches 10, preventing an infinite loop.