package Task6Statements;

public class IfElseIf {
    public static void main(String[] args) {
        
        int x = 10;
        if (x < 5) {
            System.out.println("TRUE"); // Code to be executed if condition1 is true
        } else if (x < 12) {
            System.out.println("FALSE"); // Code to be executed if condition1 is false and condition2 is true
        } else if (x < 20) {
            System.out.println("WRONG"); // Code to be executed if condition1 and condition2 are false, and condition3 is true
        
        } else {
            System.out.println("TRY AGAIN"); // Code to be executed if none of the conditions are true
        }
    }
    
}
