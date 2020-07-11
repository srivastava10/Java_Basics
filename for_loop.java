/* There are basically two ways one can create a for loop. First by using i++ for incrementing or i-- for decrementing by 1. 
   Another way is by incrementing by n where the syntax is like i = i + n or i = i - n
   
   Syntax of a for loop is:-
            for(the iterating variable, a boolean statement, incrementation or decrementation){
                The main code over here
            }
            Whenever the condition will be true, the code within the for loop block will execute and after the condition becomes false, 
            the execution leaves theblock
*/

class for_loop{
    public static void main(String args[]){
        
        for(int i=1;i<=10;i++){
            System.out.printf(" The iterating variable has the value %s now",i);
            System.out.println("");
        }
        
        System.out.println("__________________________________");
        
        for(int j=1;j<=100;j=j+2){
            System.out.printf("The value of j is %s",j);
            System.out.println("");
        }
        
    }
}