package Task2Variables;

public class InstanceVarSample {
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
