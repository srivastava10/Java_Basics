import java.util.Scanner;
public class nnaci{

	void generate(int n, int m){
	
	//Declaring Array of length = Number of Terms
	int[] array = new int[m];
	
	//Assigning First n-1 elements to be zero
		for(int i=0;i<m-1;i++){
			array[i] = 0;
		}
	//Assigning the nth Element to be 1
	array[n-1]=1;
	int sum=0;
	/*
	Logic - Calculating Sum of n element Subsets of the Array and assigning the nth+1 		element to be equal to sum;
	*/
		for(int i=1;i<m-n;i++){
			for(int j=i-1;j<=n+i;j++){
			
			sum = sum + array[j];
			}
			array[n+i-1] = sum; 
			sum=0;
		}
	
	//Finally printing the Array
	for(int i=0;i<m-1;i++){
		System.out.print(array[i]+ " ");
		}
	
	}
	
	public static void main(String args[]){
	nnaci obj = new nnaci();
	Scanner rd = new Scanner(System.in);
	System.out.println("Enter 'N' =>");
	int n = rd.nextInt();
	System.out.println("Enter Number of Terms =>");
	int m = rd.nextInt();
	
	System.out.print("The Series is :- ");
	obj.generate(n,m+1);
	
	}
}
