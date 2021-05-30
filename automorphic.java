import java.util.Scanner;
public class sum{
		boolean isAuto(int x){
			int sq = x*x;
			
			while(x>0){
				if(sq%10 != x%10){
					return false;
				}
				sq/=10;
				x/=10;
			}
			return true;
		
		}
		
		
	
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);
		sum obj = new sum();
		System.out.println("Enter Number");
		int n = rd.nextInt();
		if(obj.isAuto(n)){
		System.out.println(n+" is automorphic");
		}
		
	}

}

