import java.util.Scanner;
public class Harshad{

	int DigSum(int n){
		int sum=0;
		while(n!=0){
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

	public static void main(String args[]){
		Scanner rd =new Scanner(System.in);
		int n = rd.nextInt();
		Harshad obj = new Harshad();
		
		if(n%(obj.DigSum(n))==0){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println("Not Harshad Number");
		}
	}
}
