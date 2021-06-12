import java.util.Scanner;
public class HCF_3{
	int getHCF(int a,int b, int c){
		int p=1;
		
		for(int i=2;i<=a && i<=b && i<=c;){
		
			if(a%i==0 && b%i==0 && c%i==0){
				p=p*i;
				a=a/i;
				b=b/i;
				c=c/i;
			}
			else{
				i++;
			}
		}
		return p;
	}
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);
		int a = rd.nextInt();
		int b = rd.nextInt();
		int c = rd.nextInt();
		HCF_3 obj = new HCF_3();
		System.out.println(obj.getHCF(a,b,c));
	}
}
