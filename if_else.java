//Importing Scanner class for taking input
import java.util.Scanner;
public class if_else{
    public static void main(String args[]){
        Scanner rd = new Scanner(System.in);
        
        //Reading the number from the user
        System.out.println("Enter a number:-");
        int a =rd.nextInt();
        
        //Using if else to check whether the number is even or odd. If divisible by 2, even else odd
        while(a!=0){
            if (a%2==0){
            System.out.printf("The number %s is an even number",a);                   
        }
            else{
            System.out.printf("The number %s is an odd number",a);
        }
        a=1;        
    }
       System.out.println("The number is neither even nor odd"); 
    }
}