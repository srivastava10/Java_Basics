import java.util.Scanner;
public class LCM_3{
	int getLCM(int a,int b,int c){
	int i=1;
	for(;i<=a*b*c;i++){
		if(i%a==0 && i%b==0 && i%c==0){
			
			break;
		}
	}
	return i;
	}
	public static void main(String argsp[]){
		Scanner rd = new Scanner(System.in);
		int a = rd.nextInt();
		int b = rd.nextInt();
		int c = rd.nextInt();
		LCM_3 obj = new LCM_3();
		System.out.println("LCM is =>"+obj.getLCM(a,b,c));
	}
}

