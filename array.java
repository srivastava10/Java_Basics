public class array{
    public static void main(String args[]){
        //Creating an empty array of length n of any datatype
        int n = 5;
        int c = 4;
        int[] array_1= new int[n];
        
        String[] array_2= new String[n];
       
        //This is how we create an empty array of any length
        
        //Assigning values to these empty arrays (Note: Whenever we index an array in JAVA, the first index is always 0)
        
        for(int i=0;i<5;i++){
            
            array_1[i] = 10 + i; //Giving some normal values to the array
        }
        
        // we can also add the values like this :- 
        array_2[0] = "Welcome" ;
        array_2[1] = "To" ;
        array_2[2] = "My" ;
        array_2[3] = "Github" ;
        array_2[4] = "Repository" ;
        
        // To make the work much more easier and efficient, we can also directly initialise and store data in an array
        
        int array_3[]={1,2,3,4,5};
        
        // Now printing the elements of the array using For Loop
        
        for(int i=0;i<n;i++){
            System.out.println("Following is the element of the first array :- "+ array_1[i]);
            
        
        }
        System.out.println(" ----------------------------------------------------------------- ");
        for(int j=0;j<n;j++){
            System.out.println("Following is the element of the second array :- "+ array_2[j]);
            
        
        }
        System.out.println(" ----------------------------------------------------------------- ");
        for(int k=0;k<n;k++){
            System.out.println("Following is the element of the third array  :-"+ array_3[k]);
            
        
        }
        System.out.println(" ----------------------------------------------------------------- ");
        
        // Note : - An array, unlike a list, can only have variables of similar datatype.
        
    }
}