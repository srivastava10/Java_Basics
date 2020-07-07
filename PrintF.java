// Using printf statement as an alternative for println or print

import java.util.*;
public class PrintF{
    public static void main(String args[]){
        
        // Inputting the name
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = rd.nextLine();
        
        //Using printf statement
        //printf statement has two major aspects- %s which is the point where the variable is to be printed and the next argument which is the variable itself!
        System.out.printf("Your name is %s",name);
     
        
    }
}