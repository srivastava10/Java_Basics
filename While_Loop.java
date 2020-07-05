import java.util.Scanner;
public class While_Loop
{
  public static void main(String args[]){
    Scanner rd = new Scanner(System.in);
    //Declaring n equal to 1
    int n = 1;
    
    //While loop is a loop which works on one or more conditions.For eg- Here we gave the condition n<=10, so whenever the condition satisfies, it 
    //will print my name. The loop stops when n=11.Note we must increment n or else the while loop can become an infinite loop making the IDE crash!
    while(n<=10){
        System.out.println("Gaurav");
        n++;
        
    }
    
    }
}
