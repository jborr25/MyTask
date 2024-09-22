package Task6Statements;

public class NestedIf {
    public static void main(String[] args) {
        
        int x = 10;
        if (x > 8){  
            if (x > 9) { 
                System.out.println("Positive"); // Code to be executed if condition1 and 2 both true
            }
        }
    }
}
// You can combine multiple conditions using logical operators (&&, ||, !) to create more sophisticated expressions
// if (condition1 && condition2) {