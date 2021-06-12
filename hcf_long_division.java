/*
	Question 1: HCF Using Long Division Method
	
		
	Gaurav Srivastava 10C Roll No 37
*/



import java.util.Scanner;
public class hcf_long_division{
		int hcf(int a, int b){
			
			int rem=1;
			for(;rem!=0;){
				rem = a%b;
				a=b;
				b=rem;
				
			}
			return a;
		}
	

	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);
		int x = rd.nextInt();
		int y = rd.nextInt();
		hcf_long_division obj = new hcf_long_division();
		System.out.println("HCF is ="+obj.hcf(x,y));
		
	}

}


