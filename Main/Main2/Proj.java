package Main2;

public class Proj {
    public static void main(String[] args) {

    
      Proj2 Me = new Proj2();
      Me.name = "Jovet";
      Me.age = 34;
      Me.Person();
      System.out.println(Me.age + Me.name);

    
      Proj2 Him = new Proj2();
      Him.name = "Jovz";
      System.out.println(Him.name);
      Proj2.Person2();


       }
    

    public static void Borrico() {
        String name = "Jovet";

        if (name.equals("Jovet")) {
            System.out.println("Awesome");
        } else if (name.equals("Jovz")) {
            System.out.println("Good");
            
        }else {
            System.out.println("Negative");
        }

    
       // return name;
    }
}
