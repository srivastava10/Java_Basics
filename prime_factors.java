/*
	Question 4: To Count No. Of Prime Factors
	
	Gaurav Srivastava 10C Roll No 37
*/

import java.util.Scanner;
public class prime_factors{
		
	int countPF(int n){
		int f=0,j=0,c=1;
		System.out.print("Prime Factorisation of "+n+" is:-");
		for(int i=2;i<=n;){

			if(n%i==0){
				n/=i;
				f++;
				if(f==1){
					j=i;
				}
				if(j!=i){
					c++;
					j=i;
				}	
				System.out.print(i+"x");
						
				i=2;
				continue;
			}
			
			if(i!=2){
			i+=2;
			}
			else{
			i++;
			}
		}
		System.out.print("\b"+" ");
		
		
		return c;
		
	}

	public static void main(String args[]){
	
		int n = new Scanner(System.in).nextInt();
		prime_factors obj = new prime_factors();
		System.out.println("\nNo of Prime Factors are:- "+obj.countPF(n));
		
	}

}


