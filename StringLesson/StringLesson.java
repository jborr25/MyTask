package StringLesson;

public class StringLesson {
    public static void main(String[] args) {
        String Lastname = "borrico";
        Lastname = "Borrico";
        Lastname.toUpperCase();
        System.out.println(Lastname);
        System.out.println(Lastname.replace('b', 'X').replace('o','x'));
        //String stringTrim = "\t   \ta b c \n \n ";
        //System.out.println(stringTrim.trim());
    } 
}
