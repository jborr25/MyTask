package Task9WhileLoop;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.println("i: " + i + ", j: " + j);
                j++;
            }
            i++;
        }
    }
}
//This loop prints pairs of i and j values, iterating over all combinations of i and j from 1 to 3.