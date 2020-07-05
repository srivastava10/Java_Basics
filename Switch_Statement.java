/*
   Switch statement helps us to test a variable for different values. It is an alternative for the if-ladder and makes the job easier.Note-Switch only
   works when we have to equate between a variable and a value!
   */

import java.util.Scanner;
public class Switch_Statement
{
    public static void main(String args[]){
        //We have inputed a value n to ask which day of the week it is!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day:-");
        int n = sc.nextInt();
        
        // This is the switch body. Case x declares that we have to check whether the inputed variable is equal to x. If yes the case x body runs.
        switch(n){
            case 1:
            System.out.println("It is Sunday");
            break;
            
             case 2:
            System.out.println("It is Monday");
            break;
            
             case 3:
            System.out.println("It is Tuesday");
            break;
            
             case 4:
            System.out.println("It is Wednesday");
            break;
            
             case 5:
            System.out.println("It is Thursday");
            break;
            
             case 6:
            System.out.println("It is Friday");
            break;
            
             case 7:
            System.out.println("It is Saturday");
            break;
            
            //Default is the last part of the switch statement. If any of the cases above does not match, the default body executes.
            default:
            System.out.println("The value "+n+" does not correspond to any of the week day. Please check again!!");
            break;
            
            
        
        
        }
        
        
        
    }
   
}
