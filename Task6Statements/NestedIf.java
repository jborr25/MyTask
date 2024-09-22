package Task6Statements;

public class NestedIf {
    public static void main(String[] args) {
        
        int x = 10;
        if (x > 8){  // Code to be executed if condition1 is true
            if (x > 9) { // Code to be executed if condition2 is true
                System.out.println("Positive");
            }
        }
    }
}
// You can combine multiple conditions using logical operators (&&, ||, !) to create more sophisticated expressions
// if (condition1 && condition2) {