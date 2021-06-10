package codingswitch;

import java.util.Scanner;


public class CodingSwitch {

    
    public static void main(String[] args) {
        int x;
        String name=new String();
        System.out.println("Enter your name:");
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
        System.out.println("Enter your favorite sport:");
        System.out.println("1. Basketball\n2. Cricket\n3. Badminton\n4. Football\n5. Exit");
        x=s.nextInt();
        switch(x)
        {
            case 1:System.out.println("Congratulations "+name+"! You are selected in the basketball team.");
                   break;
            case 2:System.out.println("Congratulations "+name+"! You are selected in the Cricket team.");
                   break;
            case 3:System.out.println("Congratulations "+name+"! You are selected in the Badminton team.");
                   break;
            case 4:System.out.println("Congratulations "+name+"! You are selected in the Football team.");
                   break;
            case 5:System.out.println("Bye "+name+"!");
                   System.exit(0);
            default:System.out.println("Invalid choice");
                    break;
        }
    }
    
}
