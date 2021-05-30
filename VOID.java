import java.util.Scanner;
class VOID{
	void gen(int n){
		for(int i=1;i<=10;i++){
			System.out.println(n+"x"+i+"="+(n*i));
		
		}
	
	}
	public static void main(String args[]){
	
		Scanner rd = new Scanner(System.in);
		int n = rd.nextInt();
		VOID s = new VOID();
		s.gen(n);
	
	}	

}
