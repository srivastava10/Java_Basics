import java.util.Scanner;
public class DecBin{
	long toBin(long a){
	long bin=0,i=0;
		while(a!=1){
			
			bin+=a%2* Math.pow(10,i);
			a/=2;
			i++;
		}
		bin+= Math.pow(10,i);
		
		return bin;
	}
	
	long toDec(long b){
		long i=0,dec=0;
		
		while(b!=0){
			long d = b % 10;
			dec+=d* (int)Math.pow(2,i);
			b/=10;
			i++;
		}
		return dec;
		
	}
	
	public static void main(String args[]){
	
		Scanner rd = new Scanner(System.in);
		System.out.println("Choose the correct Option:-");
		System.out.println("[1] Decimal To Binary \n[2] Binary To Decimal");
		int opt = rd.nextInt();
		
		
		DecBin obj = new DecBin();
		switch(opt){
			case 1: 
				System.out.println("Enter Number"); 
				long n1 = rd.nextLong();
				System.out.println(obj.toBin(n1));
				break;
			case 2: 
				System.out.println("Enter Number");
				long n2 = rd.nextLong();
				System.out.println(obj.toDec(n2));
				break;
			default:
				System.out.println("Invalid Option");
				
		}

		
	}
	
}
