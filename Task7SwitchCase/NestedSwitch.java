package Task7SwitchCase;

public class NestedSwitch {
    public static void main(String[] args) {
        int day = 2;
        int time = 1;

        switch (day){
            case 1: //Sunday
                switch (time){
                    case 1: 
                    System.out.println("Sunday morning");
                    break;
                    case 2:
                    System.out.println("Sunday afternoon");
                    break;
                    case 3:
                    System.out.println("Sunday evening");
            
                }
                break;
            case 2: //Monday
            switch (time){
                case 1: 
                System.out.println("Monday morning");
                break;
                case 2:
                System.out.println("Monday afternoon");
                break;
                case 3:
                System.out.println("Monday evening");
                break;

        }
    }
    
}
}
