
//Super Palindrome

import java.util.Scanner;
public class func{
	
	boolean isSuperPalindrome(int n){
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
		func obj = new func();
		int n=  rd.nextInt();
		if(obj.isSuperPalindrome(n) && obj.isSuperPalindrome(n*n)){
			System.out.println("Super palindrome");
		}
		
		
	}

}
