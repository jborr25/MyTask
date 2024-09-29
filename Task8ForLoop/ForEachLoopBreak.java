package Task8ForLoop;

public class ForEachLoopBreak {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            if (num == 3) {
                break;
            }
            System.out.println(num);
        }
    }
}
//This loop prints numbers until it encounters 3, at which point it exits the loop.