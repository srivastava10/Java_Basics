
//Super Palindrome

import java.util.Scanner;
public class palindrome{
	
	boolean isPalindrome(int n){
		int rev  = 0;
		for(int i=n;i!=0;i/=10){
			rev = rev*10+i%10;
		}
		if(n==rev){
			return true;
		}
		return false;
	}
	
	
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter the number");
		palindrome obj = new palindrome();
		int n=  rd.nextInt();
		if(obj.isPalindrome(n) && obj.isPalindrome(n*n)){
			System.out.println("Super palindrome");
		}
		
		
	}

}
