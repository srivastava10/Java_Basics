//Decimal to given Base uptill 16
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
    System.out.println("Enter number");
    int n = rd.nextInt();
    System.out.println("Enter base");
    int base = rd.nextInt();
    
    String an = "0123456789ABCDEF";
    String val = "";
    while(n!=0){
      int rem = n%base;
      val = an.charAt(rem) + val;
      n/=base;
    }
    System.out.println(val);
    
  }
}
