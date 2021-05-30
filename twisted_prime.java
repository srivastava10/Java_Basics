import java.util.Scanner;
public class twisted_prime{
	boolean isPrime(int n){
		
		if(n<2){
		return false;
		}		
		if(n==2){
		return true;
		}
		if(n%2==0){
		return false;
		}
		for(int i=3;i*i<n;i+=2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	int reverse(int n){
		int rev=0;
		while(n>0){
			rev = rev*10+ n%10;
			n/=10;
		}
		return rev;
	}
	
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);
		twisted_prime obj = new twisted_prime();
		int n = rd.nextInt();
		int rev = obj.reverse(n);
		if(obj.isPrime(n) && obj.isPrime(rev)){
			System.out.println("Twisted Prime");
		}
		else{
			System.out.println("Not Twisted Prime");
		}
	}

}
