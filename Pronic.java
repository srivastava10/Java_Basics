import java.util.Scanner;
public class Pronic{
	
	boolean isPronic(int n){
		double x =( -1 + Math.sqrt(1+4*(n)) ) / 2.0;
		int p = (int)x;
		return p*(p+1) == n;
	}

	public static void main(String args[]){
	Scanner rd = new Scanner(System.in);
	int n = rd.nextInt();
	Pronic obj = new Pronic();
	if(obj.isPronic(n)){
		System.out.println(n+" is a Pronic Number");
	}
	
	}
}
