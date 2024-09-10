package Task2Variables;

//are variables declared within a method, constructor, or block of code (such as an if-else statement or a loop).
//They have a limited scope, meaning they can only be accessed within the block where they are declared.
//Purpose: They are used to store temporary data that is needed only within a specific context and is not relevant outside of that scope.

public class LocalVar {
    public void myMethod() {
        int x = 10; // Local variable
        String name = "Jvz"; // Local variable

        System.out.println("x = " + x);
        System.out.println("name = " + name);
    }
}
//x and name are local variables declared within the myMethod() method. 
//They can only be accessed within that method and will not be accessible outside of it.