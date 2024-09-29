package Task8ForLoop;

public class ForLoopComma {
    public static void main(String[] args) {
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i="+ i + " j="+j);
        }
    }
    
}
//This loop initializes two variables, i and j, and updates both of them in each iteration until the condition i < j becomes false.