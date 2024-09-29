package Task9WhileLoop;
import java.util.Scanner;
public class InputValidation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("You entered: " + number);
                break;
            } else {
                System.out.println("Please try again.");
            }
        }
            scanner.close();
       
        }
    }

//This loop repeatedly prompts the user to enter a positive number until a valid input is provided.
