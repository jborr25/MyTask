package Task2Variables;

//Instance variables are variables declared within the body of a class but outside of any method or constructor.
//They belong to individual objects of that class and hold data specific to each instance.
//Purpose: They store data that characterizes or describes the state of an object.

public class InstanceVar {

    String Name; //instance variable or non-static fields
    int Age; //instance variable or non-static fields

    public static void main(String[] args) {
    
    InstanceVar Name1 = new InstanceVar();
    InstanceVar Name2 = new InstanceVar();

    Name1.Name = "Jovz";
    Name1.Age = 34;

    Name2.Name = "Pinky";
    Name2.Age = 35;

    System.out.println("Name: " + Name1.Name + " Age: " + Name1.Age);
    System.out.println("Name: " + Name2.Name + " Age: " + Name2.Age);
    }
}
