import java.util.Scanner;
public class hcf{

	int HCF(int a,int b){
	
	int rem =0;
	while(b!=0){
	rem = a%b;
	a=b;
	b=rem;
	
	
	}
	return a;
		
	}
	
	public static void main(String argsp[]){
		Scanner rd = new Scanner(System.in);
		hcf obj = new hcf();
		int x= rd.nextInt();
		int y= rd.nextInt();
		
		System.out.println("HCF is= "+obj.HCF(x,y));
	}

}
