
//Power Function

import java.util.Scanner;
public class PowerFunc{
	
	double power(int a, int b){
		double p=1.0;
		
		if(b==0){
			return 1.0;
		}
		else{
			for(int i=1;i<=Math.abs(b);i++){
				p=p*a;
				}
				if(b<0){
					return 1.0/p;
				}
				else{
					return p;
				}
		}
	
	}

	
	
	
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter the number");
		PowerFunc obj = new PowerFunc();
		int x=  rd.nextInt();
		int y= rd.nextInt();
		System.out.println("The Result is"+obj.power(x,y));
		
		
		
	}

}
