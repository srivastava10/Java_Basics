//Importing library Random
import java.util.Random;

public class Random_Number{
    
    public static void main(String args[]){
        // Initiallising object r for class Random
        Random r = new Random();
        
        //initiallising integer rand so that the random number is a integer less than 10 which is specified inside the parenthesis.
        int rand = r.nextInt(10);
        
        //printing the random number
        System.out.printf("%s is a random integer within the range of 10",rand);
    }
}


/*Do it Yourself
   Make a program which shows the rolls of a dice
   1
   2
   3
   4
   5
   6
   Enjoy !!!!!
   
   */