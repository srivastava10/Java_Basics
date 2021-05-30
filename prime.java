import java.util.Scanner;
public class test{
		boolean isPrime(int x){
			int a=0;
			for(int i=1;i<=x;i++){
				if(x%i==0){
					a++;
				}
			}
			if(a==2){
				return true;
			}
			else{
				return false;
			}

			
		}
	
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);
		test obj = new test();
		System.out.println("Enter Number");
		int u = rd.nextInt();
		int v = rd.nextInt();
		
		boolean x = obj.isPrime(u);
		boolean y = obj.isPrime(v);
		if(x && y && (Math.abs(u-v)==2)){
			System.out.println("Twin Prime");
		}
		else{
			System.out.println("Not twin Prime");
		}
	}

}
