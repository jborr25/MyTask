package Task2Variables;
//are variables that belong to the class itself rather than to individual objects of the class. 
//This means that there's only one copy of a class variable shared by all instances of the class.

public class ClassVar {
    static String Family = "BORRICO"; //this is a class variable(static fields)
    static int Borrico = 0; //this is a class variable(static fields)
    String Name;
    int Age;
    ClassVar(String N, int A){
        Name = N;
        Age = A;
        Borrico++;
    }
    public static void main(String[] args){
        ClassVar M1 = new ClassVar("Jarred ", 9);
        ClassVar M2 = new ClassVar("Fiel ", 8);
        ClassVar M3 = new ClassVar("Pinky ", 35);

//Family and Borrico are a class variable declared with the static keyword.
//the class Family remains the same. The M1, M2, M3 objects share the same (Family) value.
//Every time a new ClassVar object is created, the Borrico variable is incremented.

System.out.println(M1.Name + ClassVar.Family +" "+ M1.Age);
System.out.println(M2.Name + ClassVar.Family +" "+ M2.Age);
System.out.println(M3.Name + ClassVar.Family +" "+ M3.Age);
System.out.println("Members: " + ClassVar.Borrico); 
    }
}